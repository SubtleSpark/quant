package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockReportFundHoldRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 家
     */
    @JsonProperty("持有基金家数")
    public Long c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股总数")
    public Long c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值")
    public BigDecimal c5;

    @JsonProperty("持股变化")
    public String c6;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股变动数值")
    public Long c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股变动比例")
    public BigDecimal c8;

}
