package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockEbsLgRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("沪深300指数")
    public BigDecimal c1;

    @JsonProperty("股债利差")
    public BigDecimal c2;

    @JsonProperty("股债利差均线")
    public BigDecimal c3;

}
