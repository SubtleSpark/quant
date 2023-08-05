package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardIndustrySummaryThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("板块")
    public String c1;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public String c2;

    /**
     * 注意单位: 万手
     */
    @JsonProperty("总成交量")
    public BigDecimal c3;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("总成交额")
    public BigDecimal c4;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("净流入")
    public BigDecimal c5;

    @JsonProperty("上涨家数")
    public BigDecimal c6;

    @JsonProperty("下跌家数")
    public BigDecimal c7;

    @JsonProperty("均价")
    public BigDecimal c8;

    @JsonProperty("领涨股")
    public BigDecimal c9;

    @JsonProperty("领涨股-最新价")
    public String c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("领涨股-涨跌幅")
    public String c11;

}
