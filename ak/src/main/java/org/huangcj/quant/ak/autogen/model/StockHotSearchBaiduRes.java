package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotSearchBaiduRes {
    @JsonProperty("股票名称")
    public String c0;

    @JsonProperty("涨跌幅")
    public String c1;

    @JsonProperty("所属板块名称")
    public String c2;

    @JsonProperty("市场代码")
    public String c3;

    @JsonProperty("现价")
    public BigDecimal c4;

    @JsonProperty("市场缩写")
    public String c5;

    @JsonProperty("排名变化")
    public Long c6;

    @JsonProperty("市场")
    public String c7;

}
