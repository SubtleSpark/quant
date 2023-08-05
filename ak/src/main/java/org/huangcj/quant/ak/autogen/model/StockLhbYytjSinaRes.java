package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbYytjSinaRes {
    @JsonProperty("营业部名称")
    public String c0;

    @JsonProperty("上榜次数")
    public Long c1;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积购买额")
    public BigDecimal c2;

    @JsonProperty("买入席位数")
    public Long c3;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积卖出额")
    public BigDecimal c4;

    @JsonProperty("卖出席位数")
    public Long c5;

    @JsonProperty("买入前三股票")
    public String c6;

}
