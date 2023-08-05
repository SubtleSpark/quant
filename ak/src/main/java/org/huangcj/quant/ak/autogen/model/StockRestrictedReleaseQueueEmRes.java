package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRestrictedReleaseQueueEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("解禁时间")
    public String c1;

    @JsonProperty("解禁股东数")
    public Long c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("解禁数量")
    public BigDecimal c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("实际解禁数量")
    public BigDecimal c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("未解禁数量")
    public Long c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("实际解禁数量市值")
    public BigDecimal c6;

    @JsonProperty("占总市值比例")
    public BigDecimal c7;

    @JsonProperty("占流通市值比例")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("解禁前一交易日收盘价")
    public BigDecimal c9;

    @JsonProperty("限售股类型")
    public String c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("解禁前20日涨跌幅")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("解禁后20日涨跌幅")
    public BigDecimal c12;

}
