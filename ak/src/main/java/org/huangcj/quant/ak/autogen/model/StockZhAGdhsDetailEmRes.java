package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAGdhsDetailEmRes {
    @JsonProperty("股东户数统计截止日")
    public String c0;

    /**
     * 注意单位: %
     */
    @JsonProperty("区间涨跌幅")
    public BigDecimal c1;

    @JsonProperty("股东户数-本次")
    public Long c2;

    @JsonProperty("股东户数-上次")
    public Long c3;

    @JsonProperty("股东户数-增减")
    public Long c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("股东户数-增减比例")
    public BigDecimal c5;

    @JsonProperty("户均持股市值")
    public BigDecimal c6;

    @JsonProperty("户均持股数量")
    public BigDecimal c7;

    @JsonProperty("总市值")
    public BigDecimal c8;

    @JsonProperty("总股本")
    public Long c9;

    @JsonProperty("股本变动")
    public Long c10;

    @JsonProperty("股本变动原因")
    public String c11;

    @JsonProperty("股东户数公告日期")
    public String c12;

    @JsonProperty("代码")
    public String c13;

    @JsonProperty("名称")
    public String c14;

}
