package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhANewRes {
    /**
     * 新浪代码
     */
    @JsonProperty("symbol")
    public String c0;

    /**
     * 股票代码
     */
    @JsonProperty("code")
    public String c1;

    /**
     * 股票简称
     */
    @JsonProperty("name")
    public String c2;

    /**
     * 开盘价
     */
    @JsonProperty("open")
    public BigDecimal c3;

    /**
     * 最高价
     */
    @JsonProperty("high")
    public BigDecimal c4;

    /**
     * 最低价
     */
    @JsonProperty("low")
    public BigDecimal c5;

    /**
     * 成交量
     */
    @JsonProperty("volume")
    public Long c6;

    /**
     * 成交额
     */
    @JsonProperty("amount")
    public Long c7;

    /**
     * 市值
     */
    @JsonProperty("mktcap")
    public BigDecimal c8;

    /**
     * 换手率
     */
    @JsonProperty("turnoverratio")
    public BigDecimal c9;

}
