package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSectorFundFlowHistRes {
    /**
     * 注意单位: %
     */
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("主力净流入-净额")
    public BigDecimal c1;

    /**
     * 注意单位: %
     */
    @JsonProperty("主力净流入-净占比")
    public BigDecimal c2;

    @JsonProperty("超大单净流入-净额")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("超大单净流入-净占比")
    public BigDecimal c4;

    @JsonProperty("大单净流入-净额")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("大单净流入-净占比")
    public BigDecimal c6;

    @JsonProperty("中单净流入-净额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("中单净流入-净占比")
    public BigDecimal c8;

    @JsonProperty("小单净流入-净额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("小单净流入-净占比")
    public BigDecimal c10;

}
