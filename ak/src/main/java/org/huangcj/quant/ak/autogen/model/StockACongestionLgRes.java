package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockACongestionLgRes {
    /**
     * 日期
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 收盘价
     */
    @JsonProperty("close")
    public BigDecimal c1;

    /**
     * 拥挤度
     */
    @JsonProperty("congestion")
    public BigDecimal c2;

}
