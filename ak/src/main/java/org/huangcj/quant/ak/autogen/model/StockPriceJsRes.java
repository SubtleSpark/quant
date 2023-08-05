package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockPriceJsRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("个股名称")
    public String c1;

    @JsonProperty("评级")
    public String c2;

    @JsonProperty("先前目标价")
    public BigDecimal c3;

    @JsonProperty("最新目标价")
    public BigDecimal c4;

    @JsonProperty("机构名称")
    public String c5;

}
