package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockPgEmRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("配售代码")
    public String c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("配股数量")
    public Long c3;

    @JsonProperty("配股比例")
    public String c4;

    @JsonProperty("配股价")
    public BigDecimal c5;

    @JsonProperty("最新价")
    public BigDecimal c6;

    /**
     * 注意单位: 股
     */
    @JsonProperty("配股前总股本")
    public Long c7;

    /**
     * 注意单位: 股
     */
    @JsonProperty("配股后总股本")
    public Long c8;

    @JsonProperty("股权登记日")
    public String c9;

    @JsonProperty("缴款起始日期")
    public String c10;

    @JsonProperty("缴款截止日期")
    public String c11;

    @JsonProperty("上市日")
    public String c12;

}
