package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSyProfileEmRes {
    @JsonProperty("报告期")
    public String c0;

    /**
     * 注意单位: 元
     */
    @JsonProperty("商誉")
    public BigDecimal c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("商誉减值")
    public BigDecimal c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净资产")
    public BigDecimal c3;

    @JsonProperty("商誉占净资产比例")
    public BigDecimal c4;

    @JsonProperty("商誉减值占净资产比例")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净利润规模")
    public BigDecimal c6;

    @JsonProperty("商誉减值占净利润比例")
    public BigDecimal c7;

}
