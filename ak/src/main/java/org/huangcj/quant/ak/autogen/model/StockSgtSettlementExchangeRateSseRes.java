package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSgtSettlementExchangeRateSseRes {
    @JsonProperty("适用日期")
    public String c0;

    @JsonProperty("买入结算汇兑比率")
    public BigDecimal c1;

    @JsonProperty("卖出结算汇兑比率")
    public BigDecimal c2;

    @JsonProperty("货币种类")
    public String c3;

}
