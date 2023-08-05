package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockJgdyDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("调研机构")
    public String c5;

    @JsonProperty("机构类型")
    public String c6;

    @JsonProperty("调研人员")
    public String c7;

    @JsonProperty("接待方式")
    public String c8;

    @JsonProperty("接待人员")
    public String c9;

    @JsonProperty("接待地点")
    public String c10;

    @JsonProperty("调研日期")
    public String c11;

    @JsonProperty("公告日期")
    public String c12;

}
