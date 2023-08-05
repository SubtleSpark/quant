package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbGgtjSinaRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票名称")
    public String c1;

    @JsonProperty("上榜次数")
    public Long c2;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积购买额")
    public BigDecimal c3;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积卖出额")
    public BigDecimal c4;

    /**
     * 注意单位: 万
     */
    @JsonProperty("净额")
    public BigDecimal c5;

    @JsonProperty("买入席位数")
    public Long c6;

    @JsonProperty("卖出席位数")
    public Long c7;

}
