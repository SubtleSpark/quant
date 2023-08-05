package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhACdrDailyRes {
    /**
     * 交易日
     */
    @JsonProperty("date")
    public String c0;

    @JsonProperty("open")
    public BigDecimal c1;

    @JsonProperty("high")
    public BigDecimal c2;

    @JsonProperty("low")
    public BigDecimal c3;

    @JsonProperty("close")
    public BigDecimal c4;

    /**
     * 注意单位: 手
     */
    @JsonProperty("volume")
    public BigDecimal c5;

}
