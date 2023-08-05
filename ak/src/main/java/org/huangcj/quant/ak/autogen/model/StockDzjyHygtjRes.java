package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDzjyHygtjRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("证券代码")
    public String c1;

    @JsonProperty("证券简称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("最近上榜日")
    public String c5;

    @JsonProperty("上榜次数-总计")
    public Long c6;

    @JsonProperty("上榜次数-溢价")
    public Long c7;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("总成交额")
    public BigDecimal c8;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("折溢率")
    public BigDecimal c9;

    @JsonProperty("成交总额/流通市值")
    public BigDecimal c10;

    /**
     * 注意符号: %
     */
    @JsonProperty("上榜日后平均涨跌幅-1日")
    public BigDecimal c11;

    /**
     * 注意符号: %
     */
    @JsonProperty("上榜日后平均涨跌幅-5日")
    public BigDecimal c12;

    /**
     * 注意符号: %
     */
    @JsonProperty("上榜日后平均涨跌幅-10日")
    public BigDecimal c13;

    /**
     * 注意符号: %
     */
    @JsonProperty("上榜日后平均涨跌幅-20日")
    public BigDecimal c14;

}
