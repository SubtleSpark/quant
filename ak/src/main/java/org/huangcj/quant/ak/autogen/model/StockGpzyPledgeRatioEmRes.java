package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGpzyPledgeRatioEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("交易日期")
    public String c3;

    @JsonProperty("所属行业")
    public String c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("质押比例")
    public BigDecimal c5;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("质押股数")
    public BigDecimal c6;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("质押市值")
    public BigDecimal c7;

    @JsonProperty("质押笔数")
    public BigDecimal c8;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("无限售股质押数")
    public BigDecimal c9;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("限售股质押数")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("近一年涨跌幅")
    public BigDecimal c11;

}
