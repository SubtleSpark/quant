package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtFundFlowSummaryEmRes {
    @JsonProperty("交易日")
    public String c0;

    @JsonProperty("类型")
    public String c1;

    @JsonProperty("板块")
    public String c2;

    @JsonProperty("资金方向")
    public String c3;

    /**
     * 3 为收盘
     */
    @JsonProperty("交易状态")
    public Long c4;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("成交净买额")
    public BigDecimal c5;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("资金净流入")
    public BigDecimal c6;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("当日资金余额")
    public BigDecimal c7;

    @JsonProperty("上涨数")
    public Long c8;

    @JsonProperty("持平数")
    public Long c9;

    @JsonProperty("下跌数")
    public Long c10;

    @JsonProperty("相关指数")
    public String c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("指数涨跌幅")
    public BigDecimal c12;

}
