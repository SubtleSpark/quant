package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockXgsglbEmRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("申购代码")
    public String c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("发行总数")
    public BigDecimal c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("网上发行")
    public Long c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("顶格申购需配市值")
    public BigDecimal c5;

    @JsonProperty("申购上限")
    public Long c6;

    @JsonProperty("发行价格")
    public BigDecimal c7;

    @JsonProperty("最新价")
    public BigDecimal c8;

    @JsonProperty("首日收盘价")
    public BigDecimal c9;

    @JsonProperty("申购日期")
    public String c10;

    @JsonProperty("中签号公布日")
    public String c11;

    @JsonProperty("中签缴款日期")
    public String c12;

    @JsonProperty("上市日期")
    public String c13;

    @JsonProperty("发行市盈率")
    public BigDecimal c14;

    @JsonProperty("行业市盈率")
    public BigDecimal c15;

    /**
     * 注意单位: %
     */
    @JsonProperty("中签率")
    public BigDecimal c16;

    @JsonProperty("询价累计报价倍数")
    public BigDecimal c17;

    @JsonProperty("配售对象报价家数")
    public BigDecimal c18;

    @JsonProperty("连续一字板数量")
    public String c19;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨幅")
    public BigDecimal c20;

    /**
     * 注意单位: 元
     */
    @JsonProperty("每中一签获利")
    public BigDecimal c21;

}
