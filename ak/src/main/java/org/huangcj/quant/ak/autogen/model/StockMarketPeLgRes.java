package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarketPeLgRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("指数")
    public BigDecimal c1;

    @JsonProperty("平均市盈率")
    public BigDecimal c2;

}
