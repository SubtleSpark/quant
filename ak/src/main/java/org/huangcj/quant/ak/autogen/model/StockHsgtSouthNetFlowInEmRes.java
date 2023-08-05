package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtSouthNetFlowInEmRes {
    /**
     * 日期
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("value")
    public BigDecimal c1;

}