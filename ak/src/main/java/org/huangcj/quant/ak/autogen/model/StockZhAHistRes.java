package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAHistRes {
    /**
     * 交易日
     */
    @JsonProperty("日期")
    public String c0;

    /**
     * 开盘价
     */
    @JsonProperty("开盘")
    public BigDecimal c1;

    /**
     * 收盘价
     */
    @JsonProperty("收盘")
    public BigDecimal c2;

    /**
     * 最高价
     */
    @JsonProperty("最高")
    public BigDecimal c3;

    /**
     * 最低价
     */
    @JsonProperty("最低")
    public BigDecimal c4;

    /**
     * 注意单位: 手
     */
    @JsonProperty("成交量")
    public Long c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("振幅")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("涨跌额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c10;

}
