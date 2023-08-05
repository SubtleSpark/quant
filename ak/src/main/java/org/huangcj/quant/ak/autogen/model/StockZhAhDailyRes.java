package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAhDailyRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("开盘")
    public BigDecimal c1;

    @JsonProperty("收盘")
    public BigDecimal c2;

    @JsonProperty("最高")
    public BigDecimal c3;

    @JsonProperty("最低")
    public BigDecimal c4;

    @JsonProperty("成交量")
    public BigDecimal c5;

}
