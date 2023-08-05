package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbJgmmtjEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("收盘价")
    public BigDecimal c3;

    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("买方机构数")
    public BigDecimal c5;

    @JsonProperty("卖方机构数")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构买入总额")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构卖出总额")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("机构买入净额")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("市场总成交额")
    public BigDecimal c10;

    @JsonProperty("机构净买额占总成交额比")
    public BigDecimal c11;

    @JsonProperty("换手率")
    public BigDecimal c12;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("流通市值")
    public BigDecimal c13;

    @JsonProperty("上榜原因")
    public String c14;

    @JsonProperty("上榜日期")
    public String c15;

}
