package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZygcYmRes {
    @JsonProperty("报告期")
    public String c0;

    @JsonProperty("分类方向")
    public String c1;

    @JsonProperty("分类")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业收入")
    public String c3;

    @JsonProperty("营业收入-同比增长")
    public String c4;

    @JsonProperty("营业收入-占主营收入比")
    public String c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("营业成本")
    public String c6;

    @JsonProperty("营业成本-同比增长")
    public String c7;

    @JsonProperty("营业成本-占主营成本比")
    public String c8;

    @JsonProperty("毛利率")
    public String c9;

    @JsonProperty("毛利率-同比增长")
    public String c10;

}
