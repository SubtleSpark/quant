package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhATickTxRes {
    @JsonProperty("成交时间")
    public String c0;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交价格")
    public BigDecimal c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("价格变动")
    public BigDecimal c2;

    /**
     * 注意单位: 手
     */
    @JsonProperty("成交量")
    public Integer c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public Integer c4;

    /**
     * 买卖盘标记
     */
    @JsonProperty("性质")
    public String c5;

}
