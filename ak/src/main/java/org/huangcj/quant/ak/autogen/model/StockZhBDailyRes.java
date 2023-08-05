package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhBDailyRes {
    /**
     * 交易日
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 收盘价
     */
    @JsonProperty("close")
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
     * 开盘价
     */
    @JsonProperty("open")
    public BigDecimal c4;

    /**
     * 成交量; 注意单位: 股
     */
    @JsonProperty("volume")
    public BigDecimal c5;

    /**
     * 流动股本; 注意单位: 股
     */
    @JsonProperty("outstanding_share")
    public BigDecimal c6;

    /**
     * 换手率=成交量/流动股本
     */
    @JsonProperty("turnover")
    public BigDecimal c7;

}
