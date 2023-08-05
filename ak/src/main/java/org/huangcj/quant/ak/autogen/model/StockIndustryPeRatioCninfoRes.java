package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIndustryPeRatioCninfoRes {
    @JsonProperty("变动日期")
    public String c0;

    @JsonProperty("行业分类")
    public String c1;

    @JsonProperty("行业层级")
    public Long c2;

    @JsonProperty("行业编码")
    public String c3;

    @JsonProperty("行业名称")
    public String c4;

    @JsonProperty("公司数量")
    public BigDecimal c5;

    @JsonProperty("纳入计算公司数量")
    public BigDecimal c6;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("总市值-静态")
    public BigDecimal c7;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("净利润-静态")
    public BigDecimal c8;

    @JsonProperty("静态市盈率-加权平均")
    public BigDecimal c9;

    @JsonProperty("静态市盈率-中位数")
    public BigDecimal c10;

    @JsonProperty("静态市盈率-算术平均")
    public BigDecimal c11;

}
