package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSectorDetailRes {
    @JsonProperty("symbol")
    public String c0;

    @JsonProperty("code")
    public String c1;

    @JsonProperty("name")
    public String c2;

    @JsonProperty("trade")
    public BigDecimal c3;

    @JsonProperty("pricechange")
    public BigDecimal c4;

    @JsonProperty("changepercent")
    public BigDecimal c5;

    @JsonProperty("buy")
    public BigDecimal c6;

    @JsonProperty("sell")
    public BigDecimal c7;

    @JsonProperty("settlement")
    public BigDecimal c8;

    @JsonProperty("open")
    public BigDecimal c9;

    @JsonProperty("high")
    public BigDecimal c10;

    @JsonProperty("low")
    public BigDecimal c11;

    @JsonProperty("volume")
    public Long c12;

    @JsonProperty("amount")
    public Long c13;

    @JsonProperty("ticktime")
    public String c14;

    @JsonProperty("per")
    public BigDecimal c15;

    @JsonProperty("pb")
    public BigDecimal c16;

    @JsonProperty("mktcap")
    public BigDecimal c17;

    @JsonProperty("nmc")
    public BigDecimal c18;

    @JsonProperty("turnoverratio")
    public BigDecimal c19;

}
