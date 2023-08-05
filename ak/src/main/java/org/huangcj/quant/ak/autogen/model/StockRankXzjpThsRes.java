package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRankXzjpThsRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("举牌公告日")
    public String c1;

    @JsonProperty("股票代码")
    public String c2;

    @JsonProperty("股票简称")
    public String c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("现价")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c5;

    @JsonProperty("举牌方")
    public String c6;

    /**
     * 注意单位: 股
     */
    @JsonProperty("增持数量")
    public String c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("交易均价")
    public BigDecimal c8;

    /**
     * 注意单位: %
     */
    @JsonProperty("增持数量占总股本比例")
    public BigDecimal c9;

    /**
     * 注意单位: 股
     */
    @JsonProperty("变动后持股总数")
    public String c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("变动后持股比例")
    public BigDecimal c11;

}
