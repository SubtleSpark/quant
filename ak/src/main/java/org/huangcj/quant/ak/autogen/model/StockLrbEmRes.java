package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLrbEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净利润")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("净利润同比")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总收入")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("营业总收入同比")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总支出-营业支出")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总支出-销售费用")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总支出-管理费用")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总支出-财务费用")
    public BigDecimal c10;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业总支出-营业总支出")
    public BigDecimal c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业利润")
    public BigDecimal c12;

    /**
     * 注意单位: 元
     */
    @JsonProperty("利润总额")
    public BigDecimal c13;

    @JsonProperty("公告日期")
    public String c14;

}
