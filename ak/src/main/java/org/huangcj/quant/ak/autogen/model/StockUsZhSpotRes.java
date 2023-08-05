package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockUsZhSpotRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最新价")
    public BigDecimal c2;

    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("最高")
    public BigDecimal c4;

    @JsonProperty("最低")
    public BigDecimal c5;

    @JsonProperty("昨收")
    public BigDecimal c6;

    @JsonProperty("成交量")
    public BigDecimal c7;

}
