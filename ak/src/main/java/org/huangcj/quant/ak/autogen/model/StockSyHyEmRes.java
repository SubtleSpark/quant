package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSyHyEmRes {
    @JsonProperty("行业名称")
    public String c0;

    @JsonProperty("公司家数")
    public Long c1;

    @JsonProperty("商誉规模")
    public BigDecimal c2;

    @JsonProperty("净资产")
    public BigDecimal c3;

    @JsonProperty("商誉规模占净资产规模比例")
    public BigDecimal c4;

    @JsonProperty("净利润规模")
    public BigDecimal c5;

}
