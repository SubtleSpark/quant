package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjySctjRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("交易日期")
    public String c1;

    @JsonProperty("上证指数")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("上证指数涨跌幅")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("大宗交易成交总额")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("溢价成交总额")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("溢价成交总额占比")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("折价成交总额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("折价成交总额占比")
    public BigDecimal c8;

}
