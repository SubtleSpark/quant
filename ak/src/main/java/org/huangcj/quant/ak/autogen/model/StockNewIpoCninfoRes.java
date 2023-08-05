package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockNewIpoCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("上市日期")
    public String c2;

    @JsonProperty("申购日期")
    public String c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("发行价")
    public BigDecimal c4;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("总发行数量")
    public BigDecimal c5;

    @JsonProperty("发行市盈率")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("上网发行中签率")
    public BigDecimal c7;

    @JsonProperty("摇号结果公告日")
    public String c8;

    @JsonProperty("中签公告日")
    public String c9;

    @JsonProperty("中签缴款日")
    public String c10;

    @JsonProperty("网上申购上限")
    public BigDecimal c11;

    @JsonProperty("上网发行数量")
    public BigDecimal c12;

}
