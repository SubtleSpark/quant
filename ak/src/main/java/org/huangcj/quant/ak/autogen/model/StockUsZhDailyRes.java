package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockUsZhDailyRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("前收盘价")
    public BigDecimal c1;

    @JsonProperty("开盘价")
    public BigDecimal c2;

    @JsonProperty("收盘价")
    public BigDecimal c3;

    @JsonProperty("最高价")
    public BigDecimal c4;

    @JsonProperty("最低价")
    public BigDecimal c5;

    @JsonProperty("成交量")
    public BigDecimal c6;

}
