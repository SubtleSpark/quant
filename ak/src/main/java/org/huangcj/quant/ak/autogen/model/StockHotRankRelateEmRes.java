package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotRankRelateEmRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("相关股票代码")
    public String c2;

    @JsonProperty("涨跌幅")
    public BigDecimal c3;

}
