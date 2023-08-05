package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIndexPeLgRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("指数")
    public BigDecimal c1;

    @JsonProperty("等权静态市盈率")
    public BigDecimal c2;

    @JsonProperty("静态市盈率")
    public BigDecimal c3;

    @JsonProperty("静态市盈率中位数")
    public BigDecimal c4;

    @JsonProperty("等权滚动市盈率")
    public BigDecimal c5;

    @JsonProperty("滚动市盈率")
    public BigDecimal c6;

    @JsonProperty("滚动市盈率中位数")
    public BigDecimal c7;

}
