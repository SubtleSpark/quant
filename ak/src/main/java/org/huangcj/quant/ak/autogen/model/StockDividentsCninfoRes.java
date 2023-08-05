package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDividentsCninfoRes {
    @JsonProperty("实施方案公告日期")
    public String c0;

    /**
     * 注意单位: 每 10 股
     */
    @JsonProperty("送股比例")
    public BigDecimal c1;

    /**
     * 注意单位: 每 10 股
     */
    @JsonProperty("转增比例")
    public BigDecimal c2;

    /**
     * 注意单位: 每 10 股
     */
    @JsonProperty("派息比例")
    public BigDecimal c3;

    @JsonProperty("股权登记日")
    public String c4;

    @JsonProperty("除权日")
    public String c5;

    @JsonProperty("派息日")
    public String c6;

    @JsonProperty("股份到账日")
    public String c7;

    @JsonProperty("实施方案分红说明")
    public String c8;

    @JsonProperty("分红类型")
    public String c9;

    @JsonProperty("报告时间")
    public String c10;

}
