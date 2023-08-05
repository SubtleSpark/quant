package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZygcEmRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("报告日期")
    public String c1;

    @JsonProperty("分类类型")
    public String c2;

    @JsonProperty("主营构成")
    public Long c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("主营收入")
    public BigDecimal c4;

    @JsonProperty("收入比例")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("主营成本")
    public BigDecimal c6;

    @JsonProperty("成本比例")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("主营利润")
    public BigDecimal c8;

    @JsonProperty("利润比例")
    public BigDecimal c9;

    @JsonProperty("毛利率")
    public BigDecimal c10;

}
