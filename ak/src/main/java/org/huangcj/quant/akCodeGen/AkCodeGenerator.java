package org.huangcj.quant.akCodeGen;

import com.google.common.base.CaseFormat;
import com.google.common.io.Files;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HuangChengJun
 * @Date: 2023/7/31 16:53
 * @Description: 根据akshare官方文档生成对应Java代码
 */
@Slf4j
public class AkCodeGenerator {
    private static final Map<String, AkCode> funcCodeMap = new HashMap<>();

    private static final String MODEL_TARGET_PATH = "ak/src/main/java/org/huangcj/quant/ak/autogen/model";
    private static final String MODEL_PACKAGE = "org.huangcj.quant.ak.autogen.model";
    private static final String API_TARGET_PATH = "ak/src/main/java/org/huangcj/quant/ak/autogen";
    private static final String API_PACKAGE = "org.huangcj.quant.ak.autogen";

    private static final Map<String, String> typeMap = new HashMap<>();

    static {
        typeMap.put("str", "String");
        typeMap.put("object", "String");
        typeMap.put("datetime", "String");
        typeMap.put("datetime64", "String");

        typeMap.put("int64", "Long");
        typeMap.put("int32", "Integer");
        typeMap.put("float", "BigDecimal");
        typeMap.put("float64", "BigDecimal");
    }

    private static class AkCode {
        public String lowCamelApiName;
        public String upCamelApiName;
        public String funcCode;
        public String reqCode;
        public String resCode;
    }


    public static void main(String[] args) throws IOException {
        // 读取接口文档
        Map<String, AkApiDoc> akApiDocMap = getAkDocMap("ak/src/main/resources/stock.md");

        // 生成Java代码
        akApiDocMap.forEach((k, v) -> genAllCode(v));

        StringBuilder apiFuncSb = new StringBuilder();
        // 创建文件
        for (Map.Entry<String, AkCode> entry : funcCodeMap.entrySet()) {
            AkCode code = entry.getValue();
            // xxxReq.java
            String filePath = String.format("%s/%s", MODEL_TARGET_PATH, code.upCamelApiName + "Req.java");
            new File(filePath).getParentFile().mkdirs();
            Files.asCharSink(new File(filePath), StandardCharsets.UTF_8).write(code.reqCode);

            // xxxRes.java
            filePath = String.format("%s/%s", MODEL_TARGET_PATH, code.upCamelApiName + "Res.java");
            new File(filePath).getParentFile().mkdirs();
            Files.asCharSink(new File(filePath), StandardCharsets.UTF_8).write(code.resCode);

            // AkApi.java
            apiFuncSb.append(code.funcCode);
        }
        String apiFileTemplate = """
                package %s;
                
                import %s.*;
                import jakarta.annotation.PostConstruct;
                import org.huangcj.quant.ak.annotation.AkParam;
                import org.springframework.beans.factory.annotation.Autowired;
                import org.springframework.beans.factory.annotation.Value;
                import org.springframework.http.ResponseEntity;
                import org.springframework.stereotype.Component;
                import org.springframework.util.StringUtils;
                import org.springframework.web.client.RestTemplate;
                import org.springframework.web.util.UriComponentsBuilder;
                import java.lang.reflect.Field;

                @Component
                public class AkApi {
                    %s
                    
                    @Autowired
                    private RestTemplate restTemplate;
                    @Value("${ak.baseUrl}/api/public/")
                    private String akPublicUrl;
                
                    private <T> T akGet(String apiName, Object req, Class<T> resType) {
                        UriComponentsBuilder ucb = UriComponentsBuilder.fromUriString(akPublicUrl).path(apiName);
                        Field[] declaredFields = req.getClass().getDeclaredFields();
                        for (Field declaredField : declaredFields) {
                            try {
                                // 获取注解
                                AkParam annotation = declaredField.getAnnotation(AkParam.class);
                                if (annotation != null) {
                                    if (StringUtils.hasText(annotation.value())) {
                                        ucb.queryParam(annotation.value(), declaredField.get(req));
                                    } else {
                                        ucb.queryParam(declaredField.getName(), declaredField.get(req));
                                    }
                                }
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        String uriString = ucb.build().toUriString();
                        return restTemplate.getForObject(uriString, resType);
                    }

                }
                """.formatted(API_PACKAGE, MODEL_PACKAGE, apiFuncSb.toString());

        String apiFilePath = String.format("%s/AkApi.java", API_TARGET_PATH);
        new File(apiFilePath).getParentFile().mkdirs();
        Files.asCharSink(new File(apiFilePath), StandardCharsets.UTF_8).write(apiFileTemplate);

    }

    /**
     * 将接口文档转换为AkApiDoc
     */
    private static Map<String, AkApiDoc> getAkDocMap(String pathname) throws IOException {
        File file = new File(pathname);
        FileReader fileInputStream = new FileReader(file);
        Map<String, AkApiDoc> apiMap = new HashMap<>();

        // 读取文件
        String fileStr;
        try (BufferedReader bufferedReader = new BufferedReader(fileInputStream)) {
            List<String> list = bufferedReader.lines().toList();
            fileStr = String.join("\r\n", list);
        }

        // 按接口分割
        String[] split = fileStr.split("\r\n#+ ");
        List<String> apiDocStrList = Arrays.stream(split).filter(seg -> seg.contains("接口：") || seg.contains("接口:")).toList();

        // 转换为AkApiDoc
        for (String apiDocStr : apiDocStrList) {
            AkApiDoc akApiDoc = toAkApiDoc(apiDocStr);
            apiMap.put(akApiDoc.apiName, akApiDoc);
        }

        return apiMap;
    }

    /**
     * 生成Java代码，包括函数、请求参数、响应参数
     */
    private static void genAllCode(AkApiDoc akApiDoc) {
        if (!checkApi(akApiDoc)) {
            return;
        }

        String lowerUnderscore = akApiDoc.apiName;
        String upperCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, lowerUnderscore);
        String lowerCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, lowerUnderscore);

        String codeTemplate = """
                                
                    public %sRes[] %s(%sReq req) {
                        return akGet("%s", req, %sRes[].class);
                    }
                """;
        AkCode akCode = new AkCode();
        String func = codeTemplate.formatted(upperCamel, lowerCamel, upperCamel, lowerUnderscore, upperCamel);
        akCode.funcCode = func;
        akCode.lowCamelApiName = lowerCamel;
        akCode.upCamelApiName = upperCamel;
        akCode.reqCode = genReq(akApiDoc, upperCamel + "Req", MODEL_PACKAGE);
        akCode.resCode = genRes(akApiDoc, upperCamel + "Res", MODEL_PACKAGE);
        funcCodeMap.put(akApiDoc.apiName, akCode);
    }

    /**
     * 检查接口是否满足可以生成代码的条件
     */
    private static boolean checkApi(AkApiDoc akApiDoc) {
        if (akApiDoc.akResponse.isEmpty()) {
            log.error("接口没有输出参数：{}", akApiDoc.apiName);
            return false;
        }

        for (AkApiDoc.AkResponse akResponse : akApiDoc.akResponse) {
            if (!StringUtils.hasText(akResponse.name)) {
                log.error("接口输出参数没有名称：{}", akApiDoc.apiName);
                return false;
            }
        }
        for (AkApiDoc.AkRequest akRequest : akApiDoc.akRequest) {
            if (!StringUtils.hasText(akRequest.name)) {
                log.error("接口输入参数没有名称：{}", akApiDoc.apiName);
                return false;
            }
        }
        return true;
    }

    private static String genRes(AkApiDoc akApiDoc, String className, String packageName) {
        StringBuilder sb = new StringBuilder();

        sb.append("public class ").append(className).append(" {\r\n");
        for (int i = 0; i < akApiDoc.akResponse.size(); i++) {
            AkApiDoc.AkResponse akResponse = akApiDoc.akResponse.get(i);
            String javaType = typeMap.get(akResponse.type);
            if (javaType == null) {
                throw new RuntimeException("未知类型：" + akResponse.type);
            }
            if (StringUtils.hasText(akResponse.description)) {
                sb.append("    /**\r\n");
                sb.append("     * ").append(akResponse.description).append("\r\n");
                sb.append("     */\r\n");
            }
            sb.append("    @JsonProperty(\"").append(akResponse.name).append("\")\r\n");
            sb.append("    public ").append(javaType).append(" ").append("c").append(i).append(";\r\n\r\n");
        }
        sb.append("}\r\n");

        String head = """
                package %s;
                
                import com.fasterxml.jackson.annotation.JsonProperty;

                import java.math.BigDecimal;

                """.formatted(packageName);
        sb.insert(0, head);
        return sb.toString();
    }

    /**
     * 生成请求参数实体类
     */
    private static String genReq(AkApiDoc akApiDoc, String className, String packageName) {
        StringBuilder sb = new StringBuilder();
        String head = """
                package %s;
                
                import org.huangcj.quant.ak.annotation.AkParam;

                """.formatted(packageName);
        sb.append(head);

        sb.append("public class ").append(className).append(" {\r\n");
        for (AkApiDoc.AkRequest akRequest : akApiDoc.akRequest) {
            String lowCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, akRequest.name);
            if (StringUtils.hasText(akRequest.description)) {
                String remark = """
                            /**
                             * %s
                             */
                        """.formatted(akRequest.description);
                sb.append(remark);
            }

            String field = """
                        @AkParam("%s")
                        public String %s;
                        
                    """.formatted(akRequest.name, lowCamel);

            sb.append(field);
         }
        sb.append("}\r\n");
        return sb.toString();
    }

    private static AkApiDoc toAkApiDoc(String apiDocStr) {
        AkApiDoc akApiDoc = new AkApiDoc();
        String[] split = apiDocStr.split("\r\n");

        String paramType = "";
        for (String s : split) {
            if (s.matches("^接口[：:](.*)")) {
                // 接口
                akApiDoc.apiName = s.replaceAll("^接口[：:]", "").trim();
            } else if (s.matches("^目标地址[：:](.*)")) {
                // 目标地址
                akApiDoc.targetUrl = s.replaceAll("^目标地址[：:]", "").trim();
            } else if (s.matches("^描述[：:](.*)")) {
                // 描述
                akApiDoc.description = s.replaceAll("^描述[：:]", "").trim();
            } else if (s.matches("^限量[：:](.*)")) {
                // 限量
                akApiDoc.description = s.replaceAll("^限量[：:]", "").trim();
            } else if (s.startsWith("输入参数")) {
                // 输入参数
                paramType = "i";
            } else if (s.startsWith("输出参数")) {
                // 输出参数
                paramType = "o";
            } else if (s.startsWith("|")) {
                // 参数表格
                List<String> element = Arrays.stream(s.split("\\|"))
                        .map(String::trim)
                        .filter(StringUtils::hasText)
                        .toList();
                if (element.size() == 3) {
                    if (paramType.equals("i")) {
                        AkApiDoc.AkRequest akRequest = new AkApiDoc.AkRequest();
                        akRequest.name = element.get(0);
                        akRequest.type = element.get(1);
                        akRequest.description = element.get(2);
                        akApiDoc.akRequest.add(akRequest);
                    } else if (paramType.equals("o")) {
                        AkApiDoc.AkResponse akResponse = new AkApiDoc.AkResponse();
                        akResponse.name = element.get(0);
                        akResponse.type = element.get(1);
                        akResponse.description = element.get(2);
                        akApiDoc.akResponse.add(akResponse);
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else if (s.startsWith("接口示例")) {
                break;
            }
        }

        akApiDoc.akResponse = akApiDoc.akResponse.stream()
                .filter(res -> !(res.name.equals("名称") && res.type.equals("类型") && res.description.equals("描述")))
                .peek(res -> {
                    res.name = res.name.replaceAll("^-*", "");
                    res.type = res.type.replaceAll("^-*", "");
                    res.description = res.description.replaceAll("^-*", "");
                })
                .filter(res -> StringUtils.hasText(res.name) || StringUtils.hasText(res.type) || StringUtils.hasText(res.description))
                .toList();

        akApiDoc.akRequest = akApiDoc.akRequest.stream()
                .filter(res -> !(res.name.equals("名称") && res.type.equals("类型") && res.description.equals("描述")))
                .peek(res -> {
                    res.name = res.name.replaceAll("^-*", "");
                    res.type = res.type.replaceAll("^-*", "");
                    res.description = res.description.replaceAll("^-*", "");
                })
                .filter(res -> StringUtils.hasText(res.name) || StringUtils.hasText(res.type) || StringUtils.hasText(res.description))
                .toList();

        return akApiDoc;
    }
}
