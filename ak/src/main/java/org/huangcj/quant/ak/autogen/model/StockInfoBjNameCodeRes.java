package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockInfoBjNameCodeRes {
    @JsonProperty("证券代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    /**
     * 注意单位: 股
     */
    @JsonProperty("总股本")
    public Long c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("流通股本")
    public Long c3;

    @JsonProperty("上市日期")
    public String c4;

    @JsonProperty("所属行业")
    public String c5;

    @JsonProperty("地区")
    public String c6;

    @JsonProperty("报告日期")
    public String c7;

}
