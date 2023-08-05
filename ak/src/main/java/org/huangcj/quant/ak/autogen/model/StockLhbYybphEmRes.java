package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbYybphEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("上榜后1天-买入次数")
    public Long c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后1天-平均涨幅")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后1天-上涨概率")
    public BigDecimal c4;

    @JsonProperty("上榜后2天-买入次数")
    public Long c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后2天-平均涨幅")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后2天-上涨概率")
    public BigDecimal c7;

    @JsonProperty("上榜后3天-买入次数")
    public Long c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后3天-平均涨幅")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后3天-上涨概率")
    public BigDecimal c10;

    @JsonProperty("上榜后4天-买入次数")
    public Long c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后4天-平均涨幅")
    public BigDecimal c12;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后4天-上涨概率")
    public BigDecimal c13;

    @JsonProperty("上榜后10天-买入次数")
    public Long c14;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后10天-平均涨幅")
    public BigDecimal c15;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后10天-上涨概率")
    public BigDecimal c16;

}
