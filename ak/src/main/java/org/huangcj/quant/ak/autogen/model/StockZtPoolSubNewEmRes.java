package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZtPoolSubNewEmRes {
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
    @JsonProperty("转手率")
    public BigDecimal c9;

    @JsonProperty("开板几日")
    public Long c10;

    @JsonProperty("开板日期")
    public Long c11;

    @JsonProperty("上市日期")
    public Long c12;

    @JsonProperty("是否新高")
    public Long c13;

    @JsonProperty("涨停统计")
    public String c14;

    @JsonProperty("所属行业")
    public String c15;

}
