package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtHistEmRes {
    @JsonProperty("日期")
    public String c0;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("当日成交净买额")
    public Long c1;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("买入成交额")
    public Long c2;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("卖出成交额")
    public Long c3;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("历史累计净买额")
    public BigDecimal c4;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("当日资金流入")
    public Long c5;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("当日余额")
    public Long c6;

    @JsonProperty("领涨股")
    public String c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("领涨股涨跌幅")
    public BigDecimal c8;

    @JsonProperty("上证指数")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c10;

}
