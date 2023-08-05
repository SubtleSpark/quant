package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGpzyProfileEmRes {
    @JsonProperty("交易日期")
    public String c0;

    /**
     * 注意单位: %
     */
    @JsonProperty("A股质押总比例")
    public BigDecimal c1;

    @JsonProperty("质押公司数量")
    public BigDecimal c2;

    /**
     * 注意单位: 笔
     */
    @JsonProperty("质押笔数")
    public BigDecimal c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("质押总股数")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("质押总市值")
    public BigDecimal c5;

    @JsonProperty("沪深300指数")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c7;

}
