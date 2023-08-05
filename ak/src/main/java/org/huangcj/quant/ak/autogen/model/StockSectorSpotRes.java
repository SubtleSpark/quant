package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSectorSpotRes {
    @JsonProperty("label")
    public String c0;

    @JsonProperty("板块")
    public String c1;

    @JsonProperty("公司家数")
    public Long c2;

    @JsonProperty("平均价格")
    public BigDecimal c3;

    @JsonProperty("涨跌额")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    /**
     * 注意单位: 手
     */
    @JsonProperty("总成交量")
    public Long c6;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("总成交额")
    public Long c7;

    @JsonProperty("股票代码")
    public String c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("个股-涨跌幅")
    public BigDecimal c9;

    @JsonProperty("个股-当前价")
    public BigDecimal c10;

    @JsonProperty("个股-涨跌额")
    public BigDecimal c11;

    @JsonProperty("股票名称")
    public String c12;

}
