package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHkSpotRes {
    /**
     * 港股代码
     */
    @JsonProperty("symbol")
    public String c0;

    /**
     * 中文名称
     */
    @JsonProperty("name")
    public String c1;

    /**
     * 英文名称
     */
    @JsonProperty("engname")
    public String c2;

    /**
     * 交易类型
     */
    @JsonProperty("tradetype")
    public String c3;

    /**
     * 最新价
     */
    @JsonProperty("lasttrade")
    public BigDecimal c4;

    /**
     * 前一个交易日收盘价
     */
    @JsonProperty("prevclose")
    public BigDecimal c5;

    /**
     * 开盘价
     */
    @JsonProperty("open")
    public BigDecimal c6;

    /**
     * 最高价
     */
    @JsonProperty("high")
    public BigDecimal c7;

    /**
     * 最低价
     */
    @JsonProperty("low")
    public BigDecimal c8;

    /**
     * 成交量(万)
     */
    @JsonProperty("volume")
    public BigDecimal c9;

    /**
     * 成交额(万)
     */
    @JsonProperty("amount")
    public BigDecimal c10;

    /**
     * 当前数据时间戳
     */
    @JsonProperty("ticktime")
    public String c11;

    /**
     * 买一
     */
    @JsonProperty("buy")
    public BigDecimal c12;

    /**
     * 卖一
     */
    @JsonProperty("sell")
    public BigDecimal c13;

    /**
     * 涨跌额
     */
    @JsonProperty("pricechange")
    public BigDecimal c14;

    /**
     * 涨跌幅
     */
    @JsonProperty("changepercent")
    public BigDecimal c15;

}
