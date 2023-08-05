package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSseDealDailyRes {
    /**
     * 包含了网页所有字段
     */
    @JsonProperty("单日情况")
    public String c0;

    @JsonProperty("股票")
    public BigDecimal c1;

    @JsonProperty("主板A")
    public BigDecimal c2;

    @JsonProperty("主板B")
    public BigDecimal c3;

    @JsonProperty("科创板")
    public BigDecimal c4;

    @JsonProperty("股票回购")
    public BigDecimal c5;

}
