package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockYysjEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("首次预约时间")
    public String c3;

    @JsonProperty("一次变更日期")
    public String c4;

    @JsonProperty("二次变更日期")
    public String c5;

    @JsonProperty("三次变更日期")
    public String c6;

    @JsonProperty("实际披露时间")
    public String c7;

}
