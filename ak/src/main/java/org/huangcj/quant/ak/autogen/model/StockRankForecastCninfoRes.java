package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankForecastCninfoRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("发布日期")
    public String c2;

    @JsonProperty("研究机构简称")
    public String c3;

    @JsonProperty("研究员名称")
    public String c4;

    @JsonProperty("投资评级")
    public String c5;

    @JsonProperty("是否首次评级")
    public String c6;

    @JsonProperty("评级变化")
    public String c7;

    @JsonProperty("前一次投资评级")
    public String c8;

    @JsonProperty("目标价格-下限")
    public BigDecimal c9;

    @JsonProperty("目标价格-上限")
    public BigDecimal c10;

}
