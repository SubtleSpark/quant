package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockYjbbEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("每股收益")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业收入-营业收入")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("营业收入-同比增长")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("营业收入-季度环比增长")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净利润-净利润")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("净利润-同比增长")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("净利润-季度环比增长")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("每股净资产")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("净资产收益率")
    public BigDecimal c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("每股经营现金流量")
    public BigDecimal c12;

    /**
     * 注意单位: %
     */
    @JsonProperty("销售毛利率")
    public BigDecimal c13;

    @JsonProperty("所处行业")
    public String c14;

    @JsonProperty("最新公告日期")
    public String c15;

}
