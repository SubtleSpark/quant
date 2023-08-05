package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAAllPbRes {
    /**
     * 日期
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 全部A股市净率中位数
     */
    @JsonProperty("middlePB")
    public BigDecimal c1;

    /**
     * 全部A股市净率等权平均
     */
    @JsonProperty("equalWeightAveragePB")
    public BigDecimal c2;

    /**
     * 上证指数
     */
    @JsonProperty("close")
    public BigDecimal c3;

    /**
     * 当前市净率中位数在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryMiddlePB")
    public BigDecimal c4;

    /**
     * 当前市净率中位数在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsMiddlePB")
    public BigDecimal c5;

    /**
     * 当前市净率等权平均在历史数据上的分位数
     */
    @JsonProperty("quantileInAllHistoryEqualWeightAveragePB")
    public BigDecimal c6;

    /**
     * 当前市净率等权平均在最近10年数据上的分位数
     */
    @JsonProperty("quantileInRecent10YearsEqualWeightAveragePB")
    public BigDecimal c7;

}
