package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInfoSzChangeNameRes {
    @JsonProperty("变更日期")
    public String c0;

    @JsonProperty("证券代码")
    public String c1;

    @JsonProperty("证券简称")
    public String c2;

    @JsonProperty("变更前全称")
    public String c3;

    @JsonProperty("变更后全称")
    public String c4;

}
