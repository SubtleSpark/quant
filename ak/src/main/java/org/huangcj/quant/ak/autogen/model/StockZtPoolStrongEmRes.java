package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZtPoolStrongEmRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("最新价")
    public BigDecimal c4;

    @JsonProperty("涨停价")
    public BigDecimal c5;

    @JsonProperty("成交额")
    public Long c6;

    @JsonProperty("流通市值")
    public BigDecimal c7;

    @JsonProperty("总市值")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨速")
    public BigDecimal c10;

    @JsonProperty("是否新高")
    public Long c11;

    @JsonProperty("量比")
    public BigDecimal c12;

    @JsonProperty("涨停统计")
    public String c13;

    /**
     * {'1': '60日新高', '2': '近期多次涨停', '3': '60日新高且近期多次涨停'}
     */
    @JsonProperty("入选理由")
    public String c14;

    @JsonProperty("所属行业")
    public String c15;

}
