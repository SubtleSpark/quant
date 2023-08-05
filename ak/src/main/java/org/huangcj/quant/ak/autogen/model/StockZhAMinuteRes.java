package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAMinuteRes {
    @JsonProperty("day")
    public String c0;

    @JsonProperty("open")
    public BigDecimal c1;

    @JsonProperty("high")
    public BigDecimal c2;

    @JsonProperty("low")
    public BigDecimal c3;

    @JsonProperty("close")
    public BigDecimal c4;

    @JsonProperty("volume")
    public BigDecimal c5;

}
