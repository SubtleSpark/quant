package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBuffettIndexLgRes {
    /**
     * 交易日
     */
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("收盘价")
    public BigDecimal c1;

    /**
     * A股收盘价*已发行股票总股本（A股+B股+H股）
     */
    @JsonProperty("总市值")
    public BigDecimal c2;

    /**
     * 上年度国内生产总值（例如：2019年，则取2018年GDP）
     */
    @JsonProperty("GDP")
    public BigDecimal c3;

    /**
     * 当前"总市值/GDP"在历史数据上的分位数
     */
    @JsonProperty("近十年分位数")
    public BigDecimal c4;

    /**
     * 当前"总市值/GDP"在历史数据上的分位数
     */
    @JsonProperty("总历史分位数")
    public BigDecimal c5;

}
