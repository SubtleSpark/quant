package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCirculateStockHolderRes {
    @JsonProperty("截止日期")
    public String c0;

    @JsonProperty("公告日期")
    public String c1;

    @JsonProperty("编号")
    public Long c2;

    @JsonProperty("股东名称")
    public String c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股数量")
    public Long c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股比例")
    public BigDecimal c5;

    @JsonProperty("股本性质")
    public String c6;

}
