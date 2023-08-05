package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHkFhpxDetailThsRes {
    @JsonProperty("公告日期")
    public String c0;

    @JsonProperty("方案")
    public String c1;

    @JsonProperty("除净日")
    public String c2;

    @JsonProperty("派息日")
    public String c3;

    @JsonProperty("过户日期起止日-起始")
    public String c4;

    @JsonProperty("过户日期起止日-截止")
    public String c5;

    @JsonProperty("类型")
    public String c6;

    @JsonProperty("进度")
    public String c7;

    @JsonProperty("以股代息")
    public String c8;

}
