package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockReportFundHoldDetailRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股数")
    public Long c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("持股市值")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("占总股本比例")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("占流通股本比例")
    public BigDecimal c6;

}
