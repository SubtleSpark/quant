package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGdfxHoldingDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    @JsonProperty("股东类型")
    public String c2;

    @JsonProperty("股东排名")
    public String c3;

    @JsonProperty("股票代码")
    public String c4;

    @JsonProperty("股票简称")
    public String c5;

    @JsonProperty("报告期")
    public String c6;

    /**
     * 注意单位: 股
     */
    @JsonProperty("期末持股-数量")
    public BigDecimal c7;

    /**
     * 注意单位: 股
     */
    @JsonProperty("期末持股-持股占流通股比")
    public BigDecimal c8;

    /**
     * 注意单位: 股
     */
    @JsonProperty("期末持股-数量变化")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("期末持股-数量变化比例")
    public BigDecimal c10;

    @JsonProperty("期末持股-持股变动")
    public BigDecimal c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("期末持股-流通市值")
    public BigDecimal c12;

    @JsonProperty("公告日")
    public String c13;

}
