package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhIndexDailyRes {
    /**
     * 新浪的数据开始时间, 不是证券上市时间
     */
    @JsonProperty("date")
    public String c0;

    @JsonProperty("open")
    public BigDecimal c1;

    @JsonProperty("close")
    public BigDecimal c2;

    @JsonProperty("high")
    public BigDecimal c3;

    @JsonProperty("low")
    public BigDecimal c4;

    @JsonProperty("amount")
    public BigDecimal c5;

}
