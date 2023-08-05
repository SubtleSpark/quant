package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGdfxHoldingTeamworkEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    @JsonProperty("股东类型")
    public String c2;

    @JsonProperty("协同股东名称")
    public String c3;

    @JsonProperty("协同股东类型")
    public String c4;

    @JsonProperty("协同次数")
    public Long c5;

    @JsonProperty("个股详情")
    public String c6;

}
