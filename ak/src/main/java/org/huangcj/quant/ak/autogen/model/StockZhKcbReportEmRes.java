package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhKcbReportEmRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    @JsonProperty("公告标题")
    public String c2;

    @JsonProperty("公告类型")
    public String c3;

    @JsonProperty("公告日期")
    public String c4;

    /**
     * 本代码可以用来获取公告详情: http://data.eastmoney.com/notices/detail/688595/{替换到此处}.html
     */
    @JsonProperty("公告代码")
    public String c5;

}
