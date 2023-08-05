package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRestrictedReleaseSummaryEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("解禁时间")
    public String c1;

    @JsonProperty("当日解禁股票家数")
    public Long c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("解禁数量")
    public BigDecimal c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("实际解禁数量")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("实际解禁市值")
    public Long c5;

    @JsonProperty("沪深300指数")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("沪深300指数涨跌幅")
    public BigDecimal c7;

}
