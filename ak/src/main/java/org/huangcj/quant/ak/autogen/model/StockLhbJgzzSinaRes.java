package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbJgzzSinaRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票名称")
    public String c1;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积买入额")
    public BigDecimal c2;

    @JsonProperty("买入次数")
    public BigDecimal c3;

    /**
     * 注意单位: 万
     */
    @JsonProperty("累积卖出额")
    public BigDecimal c4;

    @JsonProperty("卖出次数")
    public BigDecimal c5;

    /**
     * 注意单位: 万
     */
    @JsonProperty("净额")
    public BigDecimal c6;

}
