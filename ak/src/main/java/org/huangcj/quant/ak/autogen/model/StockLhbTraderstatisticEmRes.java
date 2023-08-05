package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbTraderstatisticEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("龙虎榜成交金额")
    public BigDecimal c2;

    @JsonProperty("上榜次数")
    public Long c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("买入额")
    public BigDecimal c4;

    @JsonProperty("买入次数")
    public Long c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("卖出额")
    public BigDecimal c6;

    @JsonProperty("卖出次数")
    public Long c7;

}
