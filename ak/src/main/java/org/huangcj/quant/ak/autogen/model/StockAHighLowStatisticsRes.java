package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAHighLowStatisticsRes {
    /**
     * 交易日
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 相关指数收盘价
     */
    @JsonProperty("close")
    public Long c1;

    /**
     * 20日新高
     */
    @JsonProperty("high20")
    public Long c2;

    /**
     * 20日新低
     */
    @JsonProperty("low20")
    public Long c3;

    /**
     * 60日新高
     */
    @JsonProperty("high60")
    public Long c4;

    /**
     * 60日新低
     */
    @JsonProperty("low60")
    public Long c5;

    /**
     * 120日新高
     */
    @JsonProperty("high120")
    public Long c6;

    /**
     * 60日新低
     */
    @JsonProperty("low120")
    public Long c7;

}
