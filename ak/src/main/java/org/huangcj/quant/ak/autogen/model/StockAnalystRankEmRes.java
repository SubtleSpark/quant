package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAnalystRankEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("分析师名称")
    public String c1;

    @JsonProperty("分析师单位")
    public String c2;

    @JsonProperty("年度指数")
    public BigDecimal c3;

    /**
     * 其中 xxxx 表示指定的年份; 注意单位: %
     */
    @JsonProperty("xxxx年收益率")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("3个月收益率")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("6个月收益率")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("12个月收益率")
    public BigDecimal c7;

    @JsonProperty("成分股个数")
    public Long c8;

    /**
     * 其中 xxxx 表示指定的年份
     */
    @JsonProperty("xxxx最新个股评级-股票名称")
    public String c9;

    /**
     * 其中 xxxx 表示指定的年份
     */
    @JsonProperty("xxxx最新个股评级-股票代码")
    public String c10;

    @JsonProperty("分析师ID")
    public String c11;

    @JsonProperty("行业代码")
    public String c12;

    @JsonProperty("行业")
    public String c13;

    /**
     * 数据更新日期
     */
    @JsonProperty("更新日期")
    public String c14;

    /**
     * 数据更新年度
     */
    @JsonProperty("年度")
    public String c15;

}
