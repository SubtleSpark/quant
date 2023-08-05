package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZyjsThsRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("主营业务")
    public String c1;

    @JsonProperty("产品类型")
    public String c2;

    @JsonProperty("产品名称")
    public String c3;

    @JsonProperty("经营范围")
    public String c4;

}
