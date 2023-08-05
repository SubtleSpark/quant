package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardConceptNameEmRes {
    @JsonProperty("排名")
    public Long c0;

    @JsonProperty("板块名称")
    public String c1;

    @JsonProperty("板块代码")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    @JsonProperty("涨跌额")
    public BigDecimal c4;

    /**
     * 注意单位：%
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    @JsonProperty("总市值")
    public Long c6;

    /**
     * 注意单位：%
     */
    @JsonProperty("换手率")
    public BigDecimal c7;

    @JsonProperty("上涨家数")
    public Long c8;

    @JsonProperty("下跌家数")
    public Long c9;

    @JsonProperty("领涨股票")
    public String c10;

    /**
     * 注意单位：%
     */
    @JsonProperty("领涨股票-涨跌幅")
    public BigDecimal c11;

}
