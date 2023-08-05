package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRestrictedReleaseQueueSinaRes {
    @JsonProperty("代码")
    public String c0;

    @JsonProperty("名称")
    public String c1;

    @JsonProperty("解禁日期")
    public String c2;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("解禁数量")
    public BigDecimal c3;

    /**
     * 注意单位: 亿元
     */
    @JsonProperty("解禁股流通市值")
    public BigDecimal c4;

    @JsonProperty("上市批次")
    public Long c5;

    @JsonProperty("公告日期")
    public String c6;

}
