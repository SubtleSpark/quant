package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCgEquityMortgageCninfoRes {
    @JsonProperty("股票代码")
    public String c0;

    @JsonProperty("股票简称")
    public String c1;

    @JsonProperty("公告日期")
    public String c2;

    @JsonProperty("出质人")
    public String c3;

    @JsonProperty("质权人")
    public String c4;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("质押数量")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("占总股本比例")
    public BigDecimal c6;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("质押解除数量")
    public BigDecimal c7;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("质押事项")
    public String c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("累计质押占总股本比例")
    public BigDecimal c9;

}
