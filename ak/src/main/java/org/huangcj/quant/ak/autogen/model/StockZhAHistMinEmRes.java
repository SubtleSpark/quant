package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAHistMinEmRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("开盘")
    public BigDecimal c1;

    @JsonProperty("收盘")
    public BigDecimal c2;

    @JsonProperty("最高")
    public BigDecimal c3;

    @JsonProperty("最低")
    public BigDecimal c4;

    /**
     * 注意单位: 手
     */
    @JsonProperty("成交量")
    public BigDecimal c5;

    @JsonProperty("成交额")
    public BigDecimal c6;

    @JsonProperty("最新价")
    public BigDecimal c7;

}
