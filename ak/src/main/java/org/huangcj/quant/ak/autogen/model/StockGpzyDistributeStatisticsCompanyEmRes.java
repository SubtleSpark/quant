package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGpzyDistributeStatisticsCompanyEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("质押机构")
    public String c1;

    @JsonProperty("质押公司数量")
    public Long c2;

    @JsonProperty("质押笔数")
    public Long c3;

    /**
     * 注意单位: 股
     */
    @JsonProperty("质押数量")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("未达预警线比例")
    public BigDecimal c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("达到预警线未达平仓线比例")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("达到平仓线比例")
    public BigDecimal c7;

}
