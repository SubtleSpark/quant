package org.huangcj.quant.akCodeGen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuangChengJun
 * @date 2023/7/31 22:37
 * <p>
 * akshare api 文档对应实体类
 */
public class AkApiDoc {
    /**
     * 接口
     */
    public String apiName;

    /**
     * 目标地址
     */
    public String targetUrl;

    /**
     * 描述
     */
    public String description;

    /**
     * 限量
     */
    public String limit;

    /**
     * 输入参数
     */
    public List<AkRequest> akRequest = new ArrayList<>();
    /**
     * 输出参数
     */
    public List<AkResponse> akResponse = new ArrayList<>();

    public String dataDemo;

    public static class AkRequest {
        public String name;
        public String type;
        public String description;
    }

    public static class AkResponse {
        public String name;
        public String type;
        public String description;
    }

}
