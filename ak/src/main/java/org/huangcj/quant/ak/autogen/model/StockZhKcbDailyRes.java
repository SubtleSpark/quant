package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhKcbDailyRes {
    @JsonProperty("date")
    public String c0;

    /**
     * 收盘价
     */
    @JsonProperty("close")
    public BigDecimal c1;

    /**
     * 最高价
     */
    @JsonProperty("high")
    public BigDecimal c2;

    /**
     * 最低价
     */
    @JsonProperty("low")
    public BigDecimal c3;

    /**
     * 开盘价
     */
    @JsonProperty("open")
    public BigDecimal c4;

    /**
     * 成交量(股)
     */
    @JsonProperty("volume")
    public BigDecimal c5;

    /**
     * 盘后量; 参见[科创板盘后固定价格交易](http://www.sse.com.cn/lawandrules/sserules/tib/trading/c/4729491.shtml)
     */
    @JsonProperty("after_volume")
    public BigDecimal c6;

    /**
     * 盘后额; 参见[科创板盘后固定价格交易](http://www.sse.com.cn/lawandrules/sserules/tib/trading/c/4729491.shtml)
     */
    @JsonProperty("after_amount")
    public BigDecimal c7;

    /**
     * 流通股本(股)
     */
    @JsonProperty("outstanding_share")
    public BigDecimal c8;

    /**
     * 换手率=成交量(股)/流通股本(股)
     */
    @JsonProperty("turnover")
    public BigDecimal c9;

}
