package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtBoardRankEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("名称")
    public String c1;

    /**
     * 注意单位: %
     */
    @JsonProperty("最新涨跌幅")
    public BigDecimal c2;

    @JsonProperty("北向资金今日持股-股票只数")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("北向资金今日持股-市值")
    public BigDecimal c4;

    @JsonProperty("北向资金今日持股-占板块比")
    public BigDecimal c5;

    @JsonProperty("北向资金今日持股-占北向资金比")
    public BigDecimal c6;

    @JsonProperty("北向资金今日增持估计-股票只数")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("北向资金今日增持估计-市值")
    public BigDecimal c8;

    @JsonProperty("北向资金今日增持估计-市值增幅")
    public BigDecimal c9;

    @JsonProperty("北向资金今日增持估计-占板块比")
    public BigDecimal c10;

    @JsonProperty("北向资金今日增持估计-占北向资金比")
    public BigDecimal c11;

    @JsonProperty("今日增持最大股-市值")
    public BigDecimal c12;

    @JsonProperty("今日增持最大股-占股本比")
    public BigDecimal c13;

    @JsonProperty("今日减持最大股-占股本比")
    public BigDecimal c14;

    @JsonProperty("今日减持最大股-市值")
    public BigDecimal c15;

    @JsonProperty("报告时间")
    public String c16;

}
