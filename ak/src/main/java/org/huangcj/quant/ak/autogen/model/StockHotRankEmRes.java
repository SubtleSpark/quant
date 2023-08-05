package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotRankEmRes {
    @JsonProperty("当前排名")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("股票名称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    @JsonProperty("涨跌额")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

}
