package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRegisterKcbRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("发行人全称")
    public String c1;

    @JsonProperty("审核状态")
    public String c2;

    @JsonProperty("注册地")
    public String c3;

    @JsonProperty("证监会行业")
    public String c4;

    @JsonProperty("保荐机构")
    public String c5;

    @JsonProperty("律师事务所")
    public String c6;

    @JsonProperty("会计师事务所")
    public String c7;

    @JsonProperty("更新日期")
    public String c8;

    @JsonProperty("受理日期")
    public String c9;

    @JsonProperty("拟上市地点")
    public String c10;

}
