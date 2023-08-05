package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankXstpThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public String c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public String c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c7;

}
