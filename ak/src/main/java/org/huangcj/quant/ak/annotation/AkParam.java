package org.huangcj.quant.ak.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HuangChengJun
 * @date 2023/8/2 21:55
 * <p>
 * 使用 value 作为 akshare 请求的参数名。
 * 如果 value has no text，则使用字段名作为参数名。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface AkParam {
    /**
     * 参数名
     */
    String value() default "";
}
