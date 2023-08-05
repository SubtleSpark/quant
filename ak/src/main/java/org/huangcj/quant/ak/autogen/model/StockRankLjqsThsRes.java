package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankLjqsThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c3;

    @JsonProperty("量价齐升天数")
    public Long c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("阶段涨幅")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("累计换手率")
    public BigDecimal c6;

    @JsonProperty("所属行业")
    public String c7;

}
