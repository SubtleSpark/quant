package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbHyyybEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("上榜日")
    public String c2;

    @JsonProperty("买入个股数")
    public BigDecimal c3;

    @JsonProperty("卖出个股数")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("买入总金额")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("卖出总金额")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("总买卖净额")
    public BigDecimal c7;

    @JsonProperty("买入股票")
    public String c8;

}
