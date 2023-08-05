package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockQbzfEmRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("增发代码")
    public String c2;

    @JsonProperty("发行方式")
    public String c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("发行总数")
    public Long c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("网上发行")
    public String c5;

    @JsonProperty("发行价格")
    public BigDecimal c6;

    @JsonProperty("最新价")
    public BigDecimal c7;

    @JsonProperty("发行日期")
    public String c8;

    @JsonProperty("增发上市日期")
    public String c9;

    @JsonProperty("锁定期")
    public String c10;

}
