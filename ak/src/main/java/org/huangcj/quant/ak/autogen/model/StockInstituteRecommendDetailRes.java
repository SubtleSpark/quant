package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInstituteRecommendDetailRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票名称")
    public String c1;

    @JsonProperty("目标价")
    public String c2;

    @JsonProperty("最新评级")
    public String c3;

    @JsonProperty("评级机构")
    public String c4;

    @JsonProperty("分析师")
    public String c5;

    @JsonProperty("行业")
    public String c6;

    @JsonProperty("评级日期")
    public String c7;

}
