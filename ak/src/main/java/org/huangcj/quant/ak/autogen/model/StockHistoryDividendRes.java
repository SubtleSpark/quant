package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHistoryDividendRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    @JsonProperty("上市日期")
    public String c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("累计股息")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("年均股息")
    public BigDecimal c4;

    @JsonProperty("分红次数")
    public BigDecimal c5;

    /**
     * 注意单位: 亿
     */
    @JsonProperty("融资总额")
    public BigDecimal c6;

    @JsonProperty("融资次数")
    public BigDecimal c7;

}
