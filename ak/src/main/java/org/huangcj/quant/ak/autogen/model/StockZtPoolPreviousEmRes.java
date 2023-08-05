package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZtPoolPreviousEmRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("最新价")
    public Long c4;

    @JsonProperty("涨停价")
    public Long c5;

    @JsonProperty("成交额")
    public Long c6;

    @JsonProperty("流通市值")
    public BigDecimal c7;

    @JsonProperty("总市值")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨速")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("振幅")
    public BigDecimal c11;

    /**
     * 注意格式: 09:25:00
     */
    @JsonProperty("昨日封板时间")
    public Long c12;

    /**
     * 注意格式: 1 为首板
     */
    @JsonProperty("昨日连板数")
    public Long c13;

    @JsonProperty("涨停统计")
    public String c14;

    @JsonProperty("所属行业")
    public String c15;

}
