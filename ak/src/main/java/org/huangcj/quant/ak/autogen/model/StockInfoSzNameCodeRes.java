package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInfoSzNameCodeRes {
    @JsonProperty("板块")
    public String c0;

    @JsonProperty("A股代码")
    public String c1;

    @JsonProperty("A股简称")
    public String c2;

    @JsonProperty("A股上市日期")
    public String c3;

    @JsonProperty("A股总股本")
    public String c4;

    @JsonProperty("A股流通股本")
    public String c5;

    @JsonProperty("所属行业")
    public String c6;

}
