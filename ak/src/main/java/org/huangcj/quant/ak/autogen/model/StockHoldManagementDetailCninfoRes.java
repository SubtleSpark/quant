package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHoldManagementDetailCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("截止日期")
    public String c2;

    @JsonProperty("公告日期")
    public String c3;

    @JsonProperty("高管姓名")
    public String c4;

    @JsonProperty("董监高姓名")
    public String c5;

    @JsonProperty("董监高职务")
    public String c6;

    @JsonProperty("变动人与董监高关系")
    public String c7;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("期初持股数量")
    public BigDecimal c8;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("期末持股数量")
    public BigDecimal c9;

    @JsonProperty("变动数量")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("变动比例")
    public Long c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("成交均价")
    public BigDecimal c12;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("期末市值")
    public BigDecimal c13;

    @JsonProperty("持股变动原因")
    public String c14;

    @JsonProperty("数据来源")
    public String c15;

}
