package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbStockDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("交易营业部名称")
    public String c1;

    @JsonProperty("买入金额")
    public BigDecimal c2;

    @JsonProperty("买入金额-占总成交比例")
    public BigDecimal c3;

    @JsonProperty("卖出金额-占总成交比例")
    public BigDecimal c4;

    @JsonProperty("净额")
    public BigDecimal c5;

    /**
     * 该字段主要处理多种龙虎榜标准问题
     */
    @JsonProperty("类型")
    public String c6;

}
