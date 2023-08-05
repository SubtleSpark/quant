package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCgLawsuitCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("公告统计区间")
    public String c2;

    @JsonProperty("诉讼次数")
    public Long c3;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("诉讼金额")
    public BigDecimal c4;

}
