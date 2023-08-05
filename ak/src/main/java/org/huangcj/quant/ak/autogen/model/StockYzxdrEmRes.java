package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockYzxdrEmRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    @JsonProperty("一致行动人")
    public String c3;

    @JsonProperty("股东排名")
    public String c4;

    @JsonProperty("持股数量")
    public Long c5;

    @JsonProperty("持股比例")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股数量变动")
    public String c7;

    @JsonProperty("行业")
    public String c8;

    @JsonProperty("公告日期")
    public String c9;

}
