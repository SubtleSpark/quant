package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockEsgRateSinaRes {
    @JsonProperty("成分股代码")
    public String c0;

    @JsonProperty("评级机构")
    public String c1;

    @JsonProperty("评级")
    public String c2;

    @JsonProperty("评级季度")
    public String c3;

    @JsonProperty("标识")
    public String c4;

    @JsonProperty("交易市场")
    public String c5;

}
