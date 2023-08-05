package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAccountStatisticsEmRes {
    @JsonProperty("数据日期")
    public String c0;

    /**
     * 注意单位: 万户
     */
    @JsonProperty("新增投资者-数量")
    public BigDecimal c1;

    @JsonProperty("新增投资者-环比")
    public BigDecimal c2;

    @JsonProperty("新增投资者-同比")
    public BigDecimal c3;

    /**
     * 注意单位: 万户
     */
    @JsonProperty("期末投资者-总量")
    public BigDecimal c4;

    /**
     * 注意单位: 万户
     */
    @JsonProperty("期末投资者-A股账户")
    public BigDecimal c5;

    /**
     * 注意单位: 万户
     */
    @JsonProperty("期末投资者-B股账户")
    public BigDecimal c6;

    @JsonProperty("沪深总市值")
    public BigDecimal c7;

    /**
     * 注意单位: 万
     */
    @JsonProperty("沪深户均市值")
    public BigDecimal c8;

    @JsonProperty("上证指数-收盘")
    public BigDecimal c9;

    @JsonProperty("上证指数-涨跌幅")
    public BigDecimal c10;

}
