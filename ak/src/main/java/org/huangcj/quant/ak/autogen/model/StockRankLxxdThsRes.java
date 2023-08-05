package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankLxxdThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最高价")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最低价")
    public BigDecimal c5;

    @JsonProperty("连涨天数")
    public Long c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("连续涨跌幅")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("累计换手率")
    public BigDecimal c8;

    @JsonProperty("所属行业")
    public String c9;

}
