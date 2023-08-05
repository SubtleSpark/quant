package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRestrictedReleaseDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("解禁时间")
    public String c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("限售股类型")
    public String c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("解禁数量")
    public BigDecimal c5;

    /**
     * 注意单位: 股
     */
    @JsonProperty("实际解禁数量")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("实际解禁市值")
    public BigDecimal c7;

    @JsonProperty("占解禁前流通市值比例")
    public BigDecimal c8;

    @JsonProperty("解禁前一交易日收盘价")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("解禁前20日涨跌幅")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("解禁后20日涨跌幅")
    public BigDecimal c11;

}
