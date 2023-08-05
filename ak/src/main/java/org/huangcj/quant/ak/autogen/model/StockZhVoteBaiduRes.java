package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhVoteBaiduRes {
    @JsonProperty("周期")
    public String c0;

    @JsonProperty("看涨")
    public String c1;

    @JsonProperty("看跌")
    public String c2;

    @JsonProperty("看涨比例")
    public String c3;

    @JsonProperty("看跌比例")
    public String c4;

}
