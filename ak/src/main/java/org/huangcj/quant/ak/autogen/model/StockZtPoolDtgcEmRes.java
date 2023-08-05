package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZtPoolDtgcEmRes {
    @JsonProperty("序号")
    public Long c0;

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
    public BigDecimal c4;

    @JsonProperty("成交额")
    public Long c5;

    @JsonProperty("流通市值")
    public BigDecimal c6;

    @JsonProperty("总市值")
    public BigDecimal c7;

    @JsonProperty("动态市盈率")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c9;

    @JsonProperty("封单资金")
    public Long c10;

    /**
     * 注意格式: 09:25:00
     */
    @JsonProperty("最后封板时间")
    public String c11;

    @JsonProperty("板上成交额")
    public Long c12;

    @JsonProperty("连续跌停")
    public Long c13;

    @JsonProperty("开板次数")
    public Long c14;

    @JsonProperty("所属行业")
    public String c15;

}
