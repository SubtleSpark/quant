package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMarginDetailSzseRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    /**
     * 注意单位: 元
     */
    @JsonProperty("融资买入额")
    public Long c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("融资余额")
    public Long c3;

    /**
     * 注意单位: 股/份
     */
    @JsonProperty("融券卖出量")
    public Long c4;

    /**
     * 注意单位: 股/份
     */
    @JsonProperty("融券余量")
    public Long c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("融券余额")
    public Long c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("融资融券余额")
    public Long c7;

}
