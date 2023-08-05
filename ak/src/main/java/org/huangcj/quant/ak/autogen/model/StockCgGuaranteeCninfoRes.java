package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCgGuaranteeCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("公告统计区间")
    public String c2;

    @JsonProperty("担保笔数")
    public Long c3;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("担保金额")
    public BigDecimal c4;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("归属于母公司所有者权益")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("担保金融占净资产比例")
    public BigDecimal c6;

}
