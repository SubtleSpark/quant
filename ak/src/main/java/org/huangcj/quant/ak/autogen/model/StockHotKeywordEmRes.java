package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotKeywordEmRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("概念名称")
    public String c2;

    @JsonProperty("概念代码")
    public String c3;

    @JsonProperty("热度")
    public Long c4;

}
