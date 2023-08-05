package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGpzyPledgeRatioDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("股东名称")
    public String c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("质押股份数量")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("占所持股份比例")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("占总股本比例")
    public BigDecimal c6;

    @JsonProperty("质押机构")
    public String c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("最新价")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("质押日收盘价")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("预估平仓线")
    public BigDecimal c10;

    @JsonProperty("公告日期")
    public String c11;

    @JsonProperty("质押开始日期")
    public String c12;

}
