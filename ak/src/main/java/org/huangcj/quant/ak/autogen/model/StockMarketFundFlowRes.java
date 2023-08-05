package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarketFundFlowRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("上证-收盘价")
    public BigDecimal c1;

    /**
     * 注意单位: %
     */
    @JsonProperty("上证-涨跌幅")
    public BigDecimal c2;

    @JsonProperty("深证-收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("深证-涨跌幅")
    public BigDecimal c4;

    @JsonProperty("主力净流入-净额")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("主力净流入-净占比")
    public BigDecimal c6;

    @JsonProperty("超大单净流入-净额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("超大单净流入-净占比")
    public BigDecimal c8;

    @JsonProperty("大单净流入-净额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("大单净流入-净占比")
    public BigDecimal c10;

    @JsonProperty("中单净流入-净额")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("中单净流入-净占比")
    public BigDecimal c12;

    @JsonProperty("小单净流入-净额")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("小单净流入-净占比")
    public BigDecimal c14;

}
