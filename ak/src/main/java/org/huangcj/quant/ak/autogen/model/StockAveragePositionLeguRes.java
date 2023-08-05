package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAveragePositionLeguRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("上证指数")
    public BigDecimal c1;

    @JsonProperty("满仓+融资")
    public Long c2;

    @JsonProperty("80%~99%")
    public Long c3;

    @JsonProperty("60%~79%")
    public Long c4;

    @JsonProperty("40%~59%")
    public Long c5;

    @JsonProperty("20%~39%")
    public Long c6;

    @JsonProperty("0%~19%")
    public Long c7;

    @JsonProperty("平均持仓")
    public Long c8;

}
