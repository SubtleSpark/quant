package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbDetailDailySinaRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票名称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("对应值")
    public BigDecimal c4;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("成交量")
    public BigDecimal c5;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交额")
    public BigDecimal c6;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("指标")
    public String c7;

}
