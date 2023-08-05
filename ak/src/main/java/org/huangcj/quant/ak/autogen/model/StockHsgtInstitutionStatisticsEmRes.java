package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHsgtInstitutionStatisticsEmRes {
    @JsonProperty("持股日期")
    public String c0;

    @JsonProperty("机构名称")
    public String c1;

    /**
     * 注意单位: 只
     */
    @JsonProperty("持股只数")
    public BigDecimal c2;

    /**
     * 注意单位: 元; 南向持股单位为: 港元
     */
    @JsonProperty("持股市值")
    public BigDecimal c3;

    /**
     * 注意单位: 元; 南向持股单位为: 港元
     */
    @JsonProperty("持股市值变化-1日")
    public BigDecimal c4;

    /**
     * 注意单位: 元; 南向持股单位为: 港元
     */
    @JsonProperty("持股市值变化-5日")
    public BigDecimal c5;

    /**
     * 注意单位: 元; 南向持股单位为: 港元
     */
    @JsonProperty("持股市值变化-10日")
    public BigDecimal c6;

}
