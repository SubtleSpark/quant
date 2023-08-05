package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtHoldStockEmRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("今日收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: 万
     */
    @JsonProperty("今日持股-股数")
    public BigDecimal c5;

    /**
     * 注意单位: 万
     */
    @JsonProperty("今日持股-市值")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日持股-占流通股比")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日持股-占总股本比")
    public BigDecimal c8;

    /**
     * 注意单位: 万; 主要字段名根据 indicator 变化
     */
    @JsonProperty("增持估计-股数")
    public BigDecimal c9;

    /**
     * 注意单位: 万; 主要字段名根据 indicator 变化
     */
    @JsonProperty("增持估计-市值")
    public BigDecimal c10;

    /**
     * 注意单位: %; 主要字段名根据 indicator 变化
     */
    @JsonProperty("增持估计-市值增幅")
    public String c11;

    /**
     * 注意单位: ‰; 主要字段名根据 indicator 变化
     */
    @JsonProperty("增持估计-占流通股比")
    public BigDecimal c12;

    /**
     * 注意单位: ‰; 主要字段名根据 indicator 变化
     */
    @JsonProperty("增持估计-占总股本比")
    public BigDecimal c13;

    @JsonProperty("所属板块")
    public String c14;

    @JsonProperty("日期")
    public String c15;

}
