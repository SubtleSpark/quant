package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFundFlowBigDealRes {
    @JsonProperty("成交时间")
    public String c0;

    @JsonProperty("股票代码")
    public Long c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("成交价格")
    public BigDecimal c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public Long c4;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("成交额")
    public BigDecimal c5;

    @JsonProperty("大单性质")
    public String c6;

    @JsonProperty("涨跌幅")
    public String c7;

    @JsonProperty("涨跌额")
    public String c8;

}
