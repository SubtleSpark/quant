package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCommentDetailScrdCostEmRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("市场成本")
    public BigDecimal c1;

    @JsonProperty("5日市场成本")
    public BigDecimal c2;

}
