package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarginSzseRes {
    /**
     * 注意单位: 亿元
     */
    @JsonProperty("融资买入额")
    public BigDecimal c0;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("融资余额")
    public BigDecimal c1;

    /**
     * 注意单位: 亿股/亿份
     */
    @JsonProperty("融券卖出量")
    public BigDecimal c2;

    /**
     * 注意单位: 亿股/亿份
     */
    @JsonProperty("融券余量")
    public BigDecimal c3;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("融券余额")
    public BigDecimal c4;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("融资融券余额")
    public BigDecimal c5;

}
