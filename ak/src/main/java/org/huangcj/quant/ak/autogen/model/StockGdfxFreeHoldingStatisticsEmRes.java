package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGdfxFreeHoldingStatisticsEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    @JsonProperty("股东类型")
    public String c2;

    @JsonProperty("统计次数")
    public Long c3;

    @JsonProperty("公告日后涨幅统计-10个交易日-平均涨幅")
    public BigDecimal c4;

    @JsonProperty("公告日后涨幅统计-10个交易日-最大涨幅")
    public BigDecimal c5;

    @JsonProperty("公告日后涨幅统计-10个交易日-最小涨幅")
    public BigDecimal c6;

    @JsonProperty("公告日后涨幅统计-30个交易日-平均涨幅")
    public BigDecimal c7;

    @JsonProperty("公告日后涨幅统计-30个交易日-最大涨幅")
    public BigDecimal c8;

    @JsonProperty("公告日后涨幅统计-30个交易日-最小涨幅")
    public BigDecimal c9;

    @JsonProperty("公告日后涨幅统计-60个交易日-平均涨幅")
    public BigDecimal c10;

    @JsonProperty("公告日后涨幅统计-60个交易日-最大涨幅")
    public BigDecimal c11;

    @JsonProperty("公告日后涨幅统计-60个交易日-最小涨幅")
    public BigDecimal c12;

    @JsonProperty("持有个股")
    public String c13;

}
