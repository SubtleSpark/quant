package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhYybControlRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("携手营业部家数")
    public Long c2;

    @JsonProperty("年内最佳携手对象")
    public String c3;

    @JsonProperty("年内最佳携手股票数")
    public Long c4;

    @JsonProperty("年内最佳携手成功率")
    public String c5;

}
