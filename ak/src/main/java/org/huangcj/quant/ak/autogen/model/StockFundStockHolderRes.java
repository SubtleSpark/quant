package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFundStockHolderRes {
    @JsonProperty("基金名称")
    public String c0;

    @JsonProperty("基金代码")
    public String c1;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持仓数量")
    public Long c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值")
    public Long c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("占净值比例")
    public BigDecimal c5;

    @JsonProperty("截止日期")
    public String c6;

}
