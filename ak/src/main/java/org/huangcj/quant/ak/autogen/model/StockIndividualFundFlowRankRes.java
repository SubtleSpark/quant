package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIndividualFundFlowRankRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日涨跌幅")
    public BigDecimal c4;

    @JsonProperty("今日主力净流入-净额")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日主力净流入-净占比")
    public BigDecimal c6;

    @JsonProperty("今日超大单净流入-净额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日超大单净流入-净占比")
    public BigDecimal c8;

    @JsonProperty("今日大单净流入-净额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日大单净流入-净占比")
    public BigDecimal c10;

    @JsonProperty("今日中单净流入-净额")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日中单净流入-净占比")
    public BigDecimal c12;

    @JsonProperty("今日小单净流入-净额")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("今日小单净流入-净占比")
    public BigDecimal c14;

}
