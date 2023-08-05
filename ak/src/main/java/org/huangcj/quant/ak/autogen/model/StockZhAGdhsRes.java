package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAGdhsRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("股东户数-本次")
    public Long c4;

    @JsonProperty("股东户数-上次")
    public Long c5;

    @JsonProperty("股东户数-增减")
    public Long c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("股东户数-增减比例")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("区间涨跌幅")
    public BigDecimal c8;

    @JsonProperty("股东户数统计截止日-本次")
    public String c9;

    @JsonProperty("股东户数统计截止日-上次")
    public String c10;

    @JsonProperty("户均持股市值")
    public BigDecimal c11;

    @JsonProperty("户均持股数量")
    public BigDecimal c12;

    @JsonProperty("总市值")
    public BigDecimal c13;

    @JsonProperty("总股本")
    public BigDecimal c14;

    @JsonProperty("公告日期")
    public String c15;

}
