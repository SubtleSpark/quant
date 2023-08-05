package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSyYqEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("业绩变动原因")
    public String c3;

    @JsonProperty("最新商誉报告期")
    public String c4;

    /**
     * 主要单位: 元
     */
    @JsonProperty("最新一期商誉")
    public BigDecimal c5;

    /**
     * 主要单位: 元
     */
    @JsonProperty("上年商誉")
    public BigDecimal c6;

    /**
     * 主要单位: 元
     */
    @JsonProperty("预计净利润-下限")
    public Long c7;

    /**
     * 主要单位: 元
     */
    @JsonProperty("预计净利润-上限")
    public Long c8;

    /**
     * 主要单位: %
     */
    @JsonProperty("业绩变动幅度-下限")
    public BigDecimal c9;

    /**
     * 主要单位: %
     */
    @JsonProperty("业绩变动幅度-上限")
    public BigDecimal c10;

    /**
     * 主要单位: 元
     */
    @JsonProperty("上年度同期净利润")
    public BigDecimal c11;

    @JsonProperty("公告日期")
    public String c12;

    @JsonProperty("交易市场")
    public String c13;

}
