package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSgtReferenceExchangeRateSzseRes {
    @JsonProperty("适用日期")
    public String c0;

    @JsonProperty("参考汇率买入价")
    public BigDecimal c1;

    @JsonProperty("参考汇率卖出价")
    public BigDecimal c2;

    @JsonProperty("货币种类")
    public String c3;

}
