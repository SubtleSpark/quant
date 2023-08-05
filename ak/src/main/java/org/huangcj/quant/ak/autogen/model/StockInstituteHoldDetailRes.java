package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInstituteHoldDetailRes {
    @JsonProperty("持股机构类型")
    public String c0;

    @JsonProperty("持股机构代码")
    public String c1;

    @JsonProperty("持股机构简称")
    public String c2;

    @JsonProperty("持股机构全称")
    public String c3;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("持股数")
    public BigDecimal c4;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("最新持股数")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股比例")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("最新持股比例")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("最新占流通股比例")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股比例增幅")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例增幅")
    public BigDecimal c11;

}
