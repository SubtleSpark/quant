package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockProfitForecastEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("研报数")
    public Long c3;

    @JsonProperty("机构投资评级(近六个月)-买入")
    public BigDecimal c4;

    @JsonProperty("机构投资评级(近六个月)-增持")
    public BigDecimal c5;

    @JsonProperty("机构投资评级(近六个月)-中性")
    public BigDecimal c6;

    @JsonProperty("机构投资评级(近六个月)-减持")
    public Long c7;

    @JsonProperty("机构投资评级(近六个月)-卖出")
    public Long c8;

    @JsonProperty("xxxx预测每股收益")
    public BigDecimal c9;

    @JsonProperty("xxxx预测每股收益")
    public BigDecimal c10;

    @JsonProperty("xxxx预测每股收益")
    public BigDecimal c11;

    @JsonProperty("xxxx预测每股收益")
    public BigDecimal c12;

}
