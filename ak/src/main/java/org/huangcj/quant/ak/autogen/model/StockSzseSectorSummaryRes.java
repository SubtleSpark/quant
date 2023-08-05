package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSzseSectorSummaryRes {
    @JsonProperty("项目名称")
    public String c0;

    @JsonProperty("项目名称-英文")
    public String c1;

    @JsonProperty("交易天数")
    public Long c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交金额-占总计")
    public BigDecimal c3;

    @JsonProperty("成交股数-股数")
    public Long c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交股数-占总计")
    public BigDecimal c5;

    @JsonProperty("成交笔数-笔")
    public Long c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("成交笔数-占总计")
    public BigDecimal c7;

}
