package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotDealXqRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("关注")
    public BigDecimal c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c3;

}
