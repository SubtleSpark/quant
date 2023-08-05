package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFundFlowIndividualRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("股票代码")
    public Long c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public String c4;

    @JsonProperty("换手率")
    public String c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("流入资金")
    public String c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("流出资金")
    public String c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净额")
    public String c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public String c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("大单流入")
    public String c10;

}
