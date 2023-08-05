package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZtPoolEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c3;

    @JsonProperty("最新价")
    public BigDecimal c4;

    @JsonProperty("成交额")
    public Long c5;

    @JsonProperty("流通市值")
    public BigDecimal c6;

    @JsonProperty("总市值")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c8;

    @JsonProperty("封板资金")
    public Long c9;

    /**
     * 注意格式: 09:25:00
     */
    @JsonProperty("首次封板时间")
    public String c10;

    /**
     * 注意格式: 09:25:00
     */
    @JsonProperty("最后封板时间")
    public String c11;

    @JsonProperty("炸板次数")
    public Long c12;

    @JsonProperty("涨停统计")
    public String c13;

    /**
     * 注意格式: 1 为首板
     */
    @JsonProperty("连板数")
    public Long c14;

    @JsonProperty("所属行业")
    public String c15;

}
