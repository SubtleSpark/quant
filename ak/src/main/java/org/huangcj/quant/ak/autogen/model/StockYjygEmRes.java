package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockYjygEmRes {
    @JsonProperty("序号")
    public String c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("预测指标")
    public BigDecimal c3;

    @JsonProperty("业绩变动")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("预测数值")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("业绩变动幅度")
    public BigDecimal c6;

    @JsonProperty("业绩变动原因")
    public BigDecimal c7;

    @JsonProperty("预告类型")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("上年同期值")
    public BigDecimal c9;

    @JsonProperty("公告日期")
    public BigDecimal c10;

}
