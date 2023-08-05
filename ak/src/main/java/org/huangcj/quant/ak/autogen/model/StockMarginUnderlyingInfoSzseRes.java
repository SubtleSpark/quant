package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarginUnderlyingInfoSzseRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("融资标的")
    public String c2;

    @JsonProperty("融券标的")
    public String c3;

    @JsonProperty("当日可融资")
    public String c4;

    @JsonProperty("当日可融券")
    public String c5;

    @JsonProperty("融券卖出价格限制")
    public String c6;

    @JsonProperty("涨跌幅限制")
    public String c7;

}
