package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardConceptConsThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("现价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("涨跌")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨速")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手")
    public BigDecimal c7;

    @JsonProperty("量比")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("振幅")
    public BigDecimal c9;

    @JsonProperty("成交额")
    public String c10;

    @JsonProperty("流通股")
    public String c11;

    @JsonProperty("流通市值")
    public String c12;

    @JsonProperty("市盈率")
    public String c13;

}
