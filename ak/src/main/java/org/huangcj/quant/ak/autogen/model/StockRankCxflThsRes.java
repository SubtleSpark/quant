package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankCxflThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public String c5;

    /**
     * 注意单位: 股
     */
    @JsonProperty("基准日成交量")
    public String c6;

    @JsonProperty("放量天数")
    public Long c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("阶段涨跌幅")
    public BigDecimal c8;

    @JsonProperty("所属行业")
    public String c9;

}
