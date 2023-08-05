package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockEsgHzSinaRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("交易市场")
    public String c2;

    @JsonProperty("股票名称")
    public String c3;

    @JsonProperty("ESG评分")
    public BigDecimal c4;

    @JsonProperty("ESG等级")
    public String c5;

    @JsonProperty("环境")
    public BigDecimal c6;

    @JsonProperty("环境等级")
    public String c7;

    @JsonProperty("社会")
    public BigDecimal c8;

    @JsonProperty("社会等级")
    public String c9;

    @JsonProperty("公司治理")
    public BigDecimal c10;

    @JsonProperty("公司治理等级")
    public String c11;

}
