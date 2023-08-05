package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotRankWcRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("现价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("个股热度")
    public BigDecimal c5;

    @JsonProperty("个股热度排名")
    public String c6;

    @JsonProperty("排名日期")
    public String c7;

}
