package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInfoShDelistRes {
    @JsonProperty("公司代码")
    public String c0;

    @JsonProperty("公司简称")
    public String c1;

    @JsonProperty("上市日期")
    public String c2;

    @JsonProperty("暂停上市日期")
    public String c3;

}
