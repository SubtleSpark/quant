package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSzseAreaSummaryRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("地区")
    public String c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("总交易额")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("占市场")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("股票交易额")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("基金交易额")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("债券交易额")
    public BigDecimal c6;

}
