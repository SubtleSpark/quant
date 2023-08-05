package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockUsHistFuRes {
    @JsonProperty("日期")
    public String c0;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("今开")
    public BigDecimal c1;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("今收")
    public BigDecimal c2;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最高")
    public BigDecimal c3;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最低")
    public BigDecimal c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public BigDecimal c5;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("成交额")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c7;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("昨收")
    public BigDecimal c8;

}