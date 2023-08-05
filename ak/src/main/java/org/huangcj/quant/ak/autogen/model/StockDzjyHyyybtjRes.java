package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjyHyyybtjRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("最近上榜日")
    public String c2;

    @JsonProperty("次数总计-买入")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("次数总计-卖出")
    public BigDecimal c4;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交金额统计-买入")
    public BigDecimal c5;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交金额统计-卖出")
    public BigDecimal c6;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交金额统计-净买入额")
    public BigDecimal c7;

}
