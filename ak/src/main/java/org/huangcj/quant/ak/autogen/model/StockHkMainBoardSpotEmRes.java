package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHkMainBoardSpotEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    /**
     * 注意单位: 港元
     */
    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: 港元
     */
    @JsonProperty("涨跌额")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    @JsonProperty("今开")
    public BigDecimal c6;

    @JsonProperty("最高")
    public BigDecimal c7;

    @JsonProperty("最低")
    public BigDecimal c8;

    @JsonProperty("昨收")
    public BigDecimal c9;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public BigDecimal c10;

    /**
     * 注意单位: 港元
     */
    @JsonProperty("成交额")
    public BigDecimal c11;

}
