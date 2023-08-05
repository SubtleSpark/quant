package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIpoBenefitThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("市值")
    public String c5;

    @JsonProperty("参股家数")
    public Long c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("投资总额")
    public String c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("投资占市值比")
    public BigDecimal c8;

    @JsonProperty("参股对象")
    public String c9;

}
