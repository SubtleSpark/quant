package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHoldNumCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("变动日期")
    public String c2;

    @JsonProperty("本期股东人数")
    public Long c3;

    @JsonProperty("上期股东人数")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("股东人数增幅")
    public BigDecimal c5;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("本期人均持股数量")
    public Long c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("上期人均持股数量")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("人均持股数量增幅")
    public BigDecimal c8;

}
