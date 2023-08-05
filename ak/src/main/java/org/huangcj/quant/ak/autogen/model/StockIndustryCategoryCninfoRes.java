package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockIndustryCategoryCninfoRes {
    @JsonProperty("类目编码")
    public String c0;

    @JsonProperty("类目名称")
    public String c1;

    @JsonProperty("终止日期")
    public String c2;

    @JsonProperty("行业类型")
    public String c3;

    @JsonProperty("行业类型编码")
    public String c4;

    @JsonProperty("类目名称英文")
    public String c5;

    @JsonProperty("父类编码")
    public String c6;

    @JsonProperty("分级")
    public Integer c7;

}
