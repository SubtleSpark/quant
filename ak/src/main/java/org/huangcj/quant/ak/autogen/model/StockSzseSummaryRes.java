package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSzseSummaryRes {
    @JsonProperty("证券类别")
    public String c0;

    /**
     * 注意单位: 只
     */
    @JsonProperty("数量")
    public Long c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交金额")
    public BigDecimal c2;

    @JsonProperty("总市值")
    public BigDecimal c3;

    @JsonProperty("流通市值")
    public BigDecimal c4;

}
