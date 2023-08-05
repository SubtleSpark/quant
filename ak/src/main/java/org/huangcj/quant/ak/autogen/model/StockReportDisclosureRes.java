package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockReportDisclosureRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("首次预约")
    public String c2;

    @JsonProperty("初次变更")
    public String c3;

    @JsonProperty("二次变更")
    public String c4;

    @JsonProperty("三次变更")
    public String c5;

    @JsonProperty("实际披露")
    public String c6;

}
