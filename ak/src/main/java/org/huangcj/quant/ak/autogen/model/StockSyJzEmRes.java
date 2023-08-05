package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSyJzEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("商誉")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("商誉减值")
    public BigDecimal c4;

    @JsonProperty("商誉减值占净资产比例")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净利润")
    public BigDecimal c6;

    @JsonProperty("商誉减值占净利润比例")
    public BigDecimal c7;

    @JsonProperty("公告日期")
    public String c8;

    @JsonProperty("交易市场")
    public String c9;

}
