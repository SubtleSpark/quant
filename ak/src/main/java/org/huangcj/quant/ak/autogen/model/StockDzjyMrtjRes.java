package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjyMrtjRes {
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

    @JsonProperty("成交均价")
    public BigDecimal c6;

    @JsonProperty("折溢率")
    public BigDecimal c7;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("成交总量")
    public BigDecimal c8;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交总额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交总额/流通市值")
    public BigDecimal c10;

}
