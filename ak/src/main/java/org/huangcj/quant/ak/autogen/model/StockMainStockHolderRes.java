package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockMainStockHolderRes {
    @JsonProperty("编号")
    public String c0;

    @JsonProperty("股东名称")
    public String c1;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股数量")
    public BigDecimal c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("持股比例")
    public BigDecimal c3;

    @JsonProperty("股本性质")
    public String c4;

    @JsonProperty("截至日期")
    public String c5;

    @JsonProperty("公告日期")
    public String c6;

    @JsonProperty("股东说明")
    public String c7;

    @JsonProperty("股东总数")
    public BigDecimal c8;

    /**
     * 备注: 按总股本计算
     */
    @JsonProperty("平均持股数")
    public BigDecimal c9;

}
