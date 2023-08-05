package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockLhbJgmxSinaRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票名称")
    public String c1;

    @JsonProperty("交易日期")
    public String c2;

    /**
     * 注意单位: 万
     */
    @JsonProperty("机构席位买入额")
    public BigDecimal c3;

    /**
     * 注意单位: 万
     */
    @JsonProperty("机构席位卖出额")
    public BigDecimal c4;

    @JsonProperty("类型")
    public String c5;

}
