package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockQsjyEmRes {
    @JsonProperty("简称")
    public String c0;

    @JsonProperty("代码")
    public String c1;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("当月净利润-净利润")
    public BigDecimal c2;

    @JsonProperty("当月净利润-同比增长")
    public BigDecimal c3;

    @JsonProperty("当月净利润-环比增长")
    public BigDecimal c4;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("当年累计净利润-累计净利润")
    public BigDecimal c5;

    @JsonProperty("当年累计净利润-同比增长")
    public BigDecimal c6;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("当月营业收入-营业收入")
    public BigDecimal c7;

    @JsonProperty("当月营业收入-环比增长")
    public BigDecimal c8;

    @JsonProperty("当月营业收入-同比增长")
    public BigDecimal c9;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("当年累计营业收入-累计营业收入")
    public BigDecimal c10;

    @JsonProperty("当年累计营业收入-同比增长")
    public BigDecimal c11;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("净资产-净资产")
    public BigDecimal c12;

    @JsonProperty("净资产-同比增长")
    public BigDecimal c13;

}
