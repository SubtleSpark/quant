package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("上榜日")
    public String c3;

    @JsonProperty("解读")
    public String c4;

    @JsonProperty("收盘价")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("龙虎榜净买额")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("龙虎榜买入额")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("龙虎榜卖出额")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("龙虎榜成交额")
    public BigDecimal c10;

    /**
     * 注意单位: 元
     */
    @JsonProperty("市场总成交额")
    public Long c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("净买额占总成交比")
    public BigDecimal c12;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交额占总成交比")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c14;

    /**
     * 注意单位: 元
     */
    @JsonProperty("流通市值")
    public BigDecimal c15;

    @JsonProperty("上榜原因")
    public String c16;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后1日")
    public BigDecimal c17;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后2日")
    public BigDecimal c18;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后5日")
    public BigDecimal c19;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后10日")
    public BigDecimal c20;

}
