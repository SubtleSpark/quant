package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbStockStatisticEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("最近上榜日")
    public String c3;

    @JsonProperty("收盘价")
    public BigDecimal c4;

    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    @JsonProperty("上榜次数")
    public BigDecimal c6;

    @JsonProperty("龙虎榜净买额")
    public BigDecimal c7;

    @JsonProperty("龙虎榜买入额")
    public BigDecimal c8;

    @JsonProperty("龙虎榜卖出额")
    public BigDecimal c9;

    @JsonProperty("龙虎榜总成交额")
    public BigDecimal c10;

    @JsonProperty("买方机构次数")
    public BigDecimal c11;

    @JsonProperty("卖方机构次数")
    public BigDecimal c12;

    @JsonProperty("机构买入净额")
    public BigDecimal c13;

    @JsonProperty("机构买入总额")
    public BigDecimal c14;

    @JsonProperty("机构卖出总额")
    public BigDecimal c15;

    @JsonProperty("近1个月涨跌幅")
    public BigDecimal c16;

    @JsonProperty("近3个月涨跌幅")
    public BigDecimal c17;

    @JsonProperty("近6个月涨跌幅")
    public BigDecimal c18;

    @JsonProperty("近1年涨跌幅")
    public BigDecimal c19;

}
