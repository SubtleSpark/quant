package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHkDailyRes {
    /**
     * 日期
     */
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

}
