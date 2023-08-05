package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInnerTradeXqRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票名称")
    public String c1;

    @JsonProperty("变动日期")
    public String c2;

    @JsonProperty("变动人")
    public String c3;

    @JsonProperty("变动股数")
    public Long c4;

    @JsonProperty("成交均价")
    public BigDecimal c5;

    @JsonProperty("变动后持股数")
    public BigDecimal c6;

    @JsonProperty("与董监高关系")
    public String c7;

    @JsonProperty("董监高职务")
    public String c8;

}
