package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtStockStatisticsEmRes {
    @JsonProperty("持股日期")
    public String c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元; 南向持股单位为: 港元
     */
    @JsonProperty("当日收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("当日涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("持股数量")
    public BigDecimal c5;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("持股市值")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股数量占发行股百分比")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-1日")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-5日")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值变化-10日")
    public BigDecimal c10;

}
