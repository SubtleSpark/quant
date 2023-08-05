package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDxsylEmRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("发行价")
    public BigDecimal c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("网上发行中签率")
    public BigDecimal c4;

    @JsonProperty("网上有效申购股数")
    public Long c5;

    /**
     * 注意单位: 户
     */
    @JsonProperty("网上有效申购户数")
    public Long c6;

    @JsonProperty("网上超额认购倍数")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("网下配售中签率")
    public BigDecimal c8;

    @JsonProperty("网下有效申购股数")
    public Long c9;

    /**
     * 注意单位: 户
     */
    @JsonProperty("网下有效申购户数")
    public Long c10;

    @JsonProperty("网下配售认购倍数")
    public BigDecimal c11;

    @JsonProperty("总发行数量")
    public Long c12;

    @JsonProperty("开盘溢价")
    public BigDecimal c13;

    @JsonProperty("首日涨幅")
    public BigDecimal c14;

    @JsonProperty("上市日期")
    public String c15;

}
