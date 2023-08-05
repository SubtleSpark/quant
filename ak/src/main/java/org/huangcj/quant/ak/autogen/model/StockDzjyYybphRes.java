package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjyYybphRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("营业部名称")
    public String c1;

    @JsonProperty("上榜后1天-买入次数")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后1天-平均涨幅")
    public BigDecimal c3;

    @JsonProperty("上榜后1天-上涨概率")
    public BigDecimal c4;

    @JsonProperty("上榜后5天-买入次数")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后5天-平均涨幅")
    public BigDecimal c6;

    @JsonProperty("上榜后5天-上涨概率")
    public BigDecimal c7;

    @JsonProperty("上榜后10天-买入次数")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后10天-平均涨幅")
    public BigDecimal c9;

    @JsonProperty("上榜后20天-买入次数")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("上榜后20天-平均涨幅")
    public BigDecimal c11;

}
