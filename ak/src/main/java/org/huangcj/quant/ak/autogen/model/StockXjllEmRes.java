package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockXjllEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净现金流-净现金流")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("净现金流-同比增长")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("经营性现金流-现金流量净额")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("经营性现金流-净现金流占比")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("投资性现金流-现金流量净额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("投资性现金流-净现金流占比")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("融资性现金流-现金流量净额")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("融资性现金流-净现金流占比")
    public BigDecimal c10;

    @JsonProperty("公告日期")
    public String c11;

}
