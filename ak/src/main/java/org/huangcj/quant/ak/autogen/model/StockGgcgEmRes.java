package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGgcgEmRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    @JsonProperty("最新价")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("股东名称")
    public String c4;

    @JsonProperty("持股变动信息-增减")
    public BigDecimal c5;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("持股变动信息-变动数量")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股变动信息-占总股本比例")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股变动信息-占流通股比例")
    public BigDecimal c8;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("变动后持股情况-持股总数")
    public BigDecimal c9;

    /**
     * 注意单位: %
     */
    @JsonProperty("变动后持股情况-占总股本比例")
    public BigDecimal c10;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("变动后持股情况-持流通股数")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("变动后持股情况-占流通股比例")
    public BigDecimal c12;

    @JsonProperty("变动开始日")
    public String c13;

    @JsonProperty("变动截止日")
    public String c14;

    @JsonProperty("公告日")
    public String c15;

}
