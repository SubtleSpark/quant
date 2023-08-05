package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockATtmLyrRes {
    /**
     * 日期
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 全A股滚动市盈率(TTM)中位数
     */
    @JsonProperty("middlePETTM")
    public BigDecimal c1;

    /**
     * 全A股滚动市盈率(TTM)等权平均
     */
    @JsonProperty("averagePETTM")
    public BigDecimal c2;

    /**
     * 全A股静态市盈率(LYR)中位数
     */
    @JsonProperty("middlePELYR")
    public BigDecimal c3;

    /**
     * 全A股静态市盈率(LYR)等权平均
     */
    @JsonProperty("averagePELYR")
    public BigDecimal c4;

    /**
     * 当前"TTM(滚动市盈率)中位数"在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryMiddlePeTtm")
    public BigDecimal c5;

    /**
     * 当前"TTM(滚动市盈率)中位数"在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsMiddlePeTtm")
    public BigDecimal c6;

    /**
     * 当前"TTM(滚动市盈率)等权平均"在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryAveragePeTtm")
    public BigDecimal c7;

    /**
     * 当前"TTM(滚动市盈率)等权平均"在在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsAveragePeTtm")
    public BigDecimal c8;

    /**
     * 当前"LYR(静态市盈率)中位数"在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryMiddlePeLyr")
    public BigDecimal c9;

    /**
     * 当前"LYR(静态市盈率)中位数"在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsMiddlePeLyr")
    public BigDecimal c10;

    /**
     * 当前"LYR(静态市盈率)等权平均"在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryAveragePeLyr")
    public BigDecimal c11;

    /**
     * 当前"LYR(静态市盈率)等权平均"在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsAveragePeLyr")
    public BigDecimal c12;

    /**
     * 沪深300指数
     */
    @JsonProperty("close")
    public BigDecimal c13;

}
