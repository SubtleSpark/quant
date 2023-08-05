package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockUsFamousSpotEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("名称")
    public String c1;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最新价")
    public BigDecimal c2;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("涨跌额")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("开盘价")
    public BigDecimal c5;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最高价")
    public BigDecimal c6;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("最低价")
    public BigDecimal c7;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("昨收价")
    public BigDecimal c8;

    /**
     * 注意单位: 美元
     */
    @JsonProperty("总市值")
    public BigDecimal c9;

    @JsonProperty("市盈率")
    public BigDecimal c10;

    /**
     * 注意: 用来获取历史数据的代码
     */
    @JsonProperty("代码")
    public String c11;

}
