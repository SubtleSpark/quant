package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFundFlowConceptRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("行业")
    public String c1;

    @JsonProperty("行业指数")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("行业-涨跌幅")
    public BigDecimal c3;

    /**
     * 注意单位: 亿
     */
    @JsonProperty("流入资金")
    public BigDecimal c4;

    /**
     * 注意单位: 亿
     */
    @JsonProperty("流出资金")
    public BigDecimal c5;

    /**
     * 注意单位: 亿
     */
    @JsonProperty("净额")
    public BigDecimal c6;

    @JsonProperty("公司家数")
    public BigDecimal c7;

    @JsonProperty("领涨股")
    public String c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("领涨股-涨跌幅")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("当前价")
    public BigDecimal c10;

}
