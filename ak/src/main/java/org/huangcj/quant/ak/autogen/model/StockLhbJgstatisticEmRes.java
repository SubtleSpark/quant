package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbJgstatisticEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("收盘价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("龙虎榜成交金额")
    public BigDecimal c5;

    @JsonProperty("上榜次数")
    public Long c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构买入额")
    public BigDecimal c7;

    @JsonProperty("机构买入次数")
    public Long c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构卖出额")
    public BigDecimal c9;

    @JsonProperty("机构卖出次数")
    public Long c10;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构净买额")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("近1个月涨跌幅")
    public BigDecimal c12;

    /**
     * 注意单位: %
     */
    @JsonProperty("近3个月涨跌幅")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("近6个月涨跌幅")
    public BigDecimal c14;

    /**
     * 注意单位: %
     */
    @JsonProperty("近1年涨跌幅")
    public BigDecimal c15;

}
