package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHoldControlCninfoRes {
    @JsonProperty("证劵代码")
    public String c0;

    @JsonProperty("证券简称")
    public String c1;

    @JsonProperty("变动日期")
    public String c2;

    @JsonProperty("实际控制人名称")
    public String c3;

    /**
     * 注意单位: 万股
     */
    @JsonProperty("控股数量")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("控股比例")
    public BigDecimal c5;

    @JsonProperty("直接控制人名称")
    public String c6;

    @JsonProperty("控制类型")
    public String c7;

}
