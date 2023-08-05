package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIpoDeclareRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("申报企业")
    public String c1;

    @JsonProperty("拟上市地")
    public String c2;

    @JsonProperty("保荐机构")
    public String c3;

    @JsonProperty("会计师事务所")
    public String c4;

    @JsonProperty("律师事务所")
    public String c5;

    @JsonProperty("备注")
    public String c6;

}
