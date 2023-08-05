package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInfoSzDelistRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("上市日期")
    public String c2;

    @JsonProperty("终止上市日期")
    public String c3;

}
