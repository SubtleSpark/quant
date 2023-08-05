package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInstituteHoldRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("机构数")
    public Long c2;

    @JsonProperty("机构数变化")
    public Long c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股比例")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股比例增幅")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例增幅")
    public BigDecimal c7;

}
