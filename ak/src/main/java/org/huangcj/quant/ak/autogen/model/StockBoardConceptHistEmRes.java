package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardConceptHistEmRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("开盘")
    public BigDecimal c1;

    @JsonProperty("收盘")
    public BigDecimal c2;

    @JsonProperty("最高")
    public BigDecimal c3;

    @JsonProperty("最低")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    @JsonProperty("涨跌额")
    public BigDecimal c6;

    @JsonProperty("成交量")
    public Long c7;

    @JsonProperty("成交额")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("振幅")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c10;

}
