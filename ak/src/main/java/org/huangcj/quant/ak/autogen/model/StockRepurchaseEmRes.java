package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRepurchaseEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("计划回购价格区间")
    public BigDecimal c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("计划回购数量区间-下限")
    public BigDecimal c5;

    /**
     * 注意单位: 股
     */
    @JsonProperty("计划回购数量区间-上限")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("占公告前一日总股本比例-下限")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("占公告前一日总股本比例-上限")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("计划回购金额区间-下限")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("计划回购金额区间-上限")
    public BigDecimal c10;

    @JsonProperty("回购起始时间")
    public String c11;

    @JsonProperty("实施进度")
    public String c12;

    /**
     * 注意单位: %
     */
    @JsonProperty("已回购股份价格区间-下限")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("已回购股份价格区间-上限")
    public BigDecimal c14;

    /**
     * 注意单位: 股
     */
    @JsonProperty("已回购股份数量")
    public BigDecimal c15;

    /**
     * 注意单位: 元
     */
    @JsonProperty("已回购金额")
    public BigDecimal c16;

    @JsonProperty("最新公告日期")
    public String c17;

}
