package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockSyEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("商誉")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("净利润")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("上年商誉")
    public BigDecimal c5;

    @JsonProperty("公告日期")
    public String c6;

    @JsonProperty("交易市场")
    public String c7;

}
