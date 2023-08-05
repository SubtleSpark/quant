package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarketPbLgRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("指数")
    public BigDecimal c1;

    @JsonProperty("市净率")
    public BigDecimal c2;

    @JsonProperty("等权市净率")
    public BigDecimal c3;

    @JsonProperty("市净率中位数")
    public BigDecimal c4;

}
