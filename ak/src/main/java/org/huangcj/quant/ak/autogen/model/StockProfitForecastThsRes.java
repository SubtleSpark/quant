package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockProfitForecastThsRes {
    @JsonProperty("年度")
    public String c0;

    @JsonProperty("预测机构数")
    public Long c1;

    @JsonProperty("最小值")
    public BigDecimal c2;

    @JsonProperty("均值")
    public BigDecimal c3;

    @JsonProperty("最大值")
    public BigDecimal c4;

    @JsonProperty("行业平均数")
    public BigDecimal c5;

}
