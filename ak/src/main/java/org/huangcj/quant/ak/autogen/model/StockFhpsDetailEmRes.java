package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFhpsDetailEmRes {
    @JsonProperty("报告期")
    public String c0;

    @JsonProperty("业绩披露日期")
    public String c1;

    @JsonProperty("送转股份-送转总比例")
    public BigDecimal c2;

    @JsonProperty("送转股份-送股比例")
    public BigDecimal c3;

    @JsonProperty("送转股份-转股比例")
    public BigDecimal c4;

    @JsonProperty("现金分红-现金分红比例")
    public BigDecimal c5;

    @JsonProperty("现金分红-现金分红比例描述")
    public String c6;

    @JsonProperty("现金分红-股息率")
    public BigDecimal c7;

    @JsonProperty("每股收益")
    public BigDecimal c8;

    @JsonProperty("每股净资产")
    public BigDecimal c9;

    @JsonProperty("每股公积金")
    public BigDecimal c10;

    @JsonProperty("每股未分配利润")
    public BigDecimal c11;

    @JsonProperty("净利润同比增长")
    public BigDecimal c12;

    @JsonProperty("总股本")
    public Long c13;

    @JsonProperty("预案公告日")
    public String c14;

    @JsonProperty("股权登记日")
    public String c15;

    @JsonProperty("除权除息日")
    public String c16;

    @JsonProperty("方案进度")
    public String c17;

    @JsonProperty("最新公告日期")
    public String c18;

}
