package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGpzyIndustryDataEmRes {
    @JsonProperty("行业")
    public String c0;

    /**
     * 注意单位: %
     */
    @JsonProperty("平均质押比例")
    public BigDecimal c1;

    @JsonProperty("公司家数")
    public BigDecimal c2;

    @JsonProperty("质押总笔数")
    public BigDecimal c3;

    @JsonProperty("质押总股本")
    public BigDecimal c4;

    @JsonProperty("最新质押市值")
    public BigDecimal c5;

    @JsonProperty("统计时间")
    public String c6;

}
