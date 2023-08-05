package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockUsDailyRes {
    @JsonProperty("date")
    public String c0;

    /**
     * 开盘价
     */
    @JsonProperty("open")
    public BigDecimal c1;

    /**
     * 最高价
     */
    @JsonProperty("high")
    public BigDecimal c2;

    /**
     * 最低价
     */
    @JsonProperty("low")
    public BigDecimal c3;

    /**
     * 收盘价
     */
    @JsonProperty("close")
    public BigDecimal c4;

    /**
     * 成交量
     */
    @JsonProperty("volume")
    public BigDecimal c5;

    /**
     * 日期
     */
    @JsonProperty("date")
    public String c6;

    /**
     * 前复权因子
     */
    @JsonProperty("qfq_factor")
    public BigDecimal c7;

    /**
     * 由于前复权会出现负值, 该值为调整因子
     */
    @JsonProperty("adjust")
    public BigDecimal c8;

}
