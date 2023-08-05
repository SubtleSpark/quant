package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjyMrmxRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("交易日期")
    public String c1;

    @JsonProperty("证券代码")
    public String c2;

    @JsonProperty("证券简称")
    public String c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("收盘价")
    public BigDecimal c5;

    @JsonProperty("成交价")
    public BigDecimal c6;

    @JsonProperty("折溢率")
    public BigDecimal c7;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交额/流通市值")
    public BigDecimal c10;

    @JsonProperty("买方营业部")
    public String c11;

    @JsonProperty("卖方营业部")
    public String c12;

}
