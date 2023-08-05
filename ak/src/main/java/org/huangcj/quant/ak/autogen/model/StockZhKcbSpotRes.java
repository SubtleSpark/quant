package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhKcbSpotRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    @JsonProperty("最新价")
    public BigDecimal c2;

    @JsonProperty("涨跌额")
    public BigDecimal c3;

    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("买入")
    public BigDecimal c5;

    @JsonProperty("卖出")
    public BigDecimal c6;

    @JsonProperty("昨收")
    public BigDecimal c7;

    @JsonProperty("今开")
    public BigDecimal c8;

    @JsonProperty("最高")
    public BigDecimal c9;

    @JsonProperty("最低")
    public BigDecimal c10;

    /**
     * 注意单位: 股
     */
    @JsonProperty("成交量")
    public BigDecimal c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交额")
    public BigDecimal c12;

    /**
     * 注意: 数据获取的时间点
     */
    @JsonProperty("时点")
    public String c13;

    @JsonProperty("市盈率")
    public BigDecimal c14;

    @JsonProperty("市净率")
    public BigDecimal c15;

    @JsonProperty("流通市值")
    public BigDecimal c16;

    @JsonProperty("总市值")
    public BigDecimal c17;

    @JsonProperty("换手率")
    public BigDecimal c18;

}
