package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGdfxFreeHoldingChangeEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    @JsonProperty("股东类型")
    public String c2;

    @JsonProperty("期末持股只数统计-总持有")
    public BigDecimal c3;

    @JsonProperty("期末持股只数统计-新进")
    public BigDecimal c4;

    @JsonProperty("期末持股只数统计-增加")
    public BigDecimal c5;

    @JsonProperty("期末持股只数统计-不变")
    public BigDecimal c6;

    @JsonProperty("期末持股只数统计-减少")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("流通市值统计")
    public BigDecimal c8;

    @JsonProperty("持有个股")
    public String c9;

}
