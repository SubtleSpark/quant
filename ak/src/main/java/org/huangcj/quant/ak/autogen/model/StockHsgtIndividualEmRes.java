package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtIndividualEmRes {
    @JsonProperty("持股日期")
    public String c0;

    /**
     * 注意单位: 元
     */
    @JsonProperty("当日收盘价")
    public BigDecimal c1;

    /**
     * 注意单位: %
     */
    @JsonProperty("当日涨跌幅")
    public BigDecimal c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股数量")
    public Long c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股数量占A股百分比")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-1日")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-5日")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-10日")
    public BigDecimal c8;

}
