package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAIndicatorLgRes {
    /**
     * 交易日
     */
    @JsonProperty("trade_date")
    public String c0;

    /**
     * 市盈率
     */
    @JsonProperty("pe")
    public BigDecimal c1;

    /**
     * 市盈率TTM
     */
    @JsonProperty("pe_ttm")
    public BigDecimal c2;

    /**
     * 市净率
     */
    @JsonProperty("pb")
    public BigDecimal c3;

    /**
     * 市销率
     */
    @JsonProperty("ps")
    public BigDecimal c4;

    /**
     * 市销率TTM
     */
    @JsonProperty("ps_ttm")
    public BigDecimal c5;

    /**
     * 股息率
     */
    @JsonProperty("dv_ratio")
    public BigDecimal c6;

    /**
     * 股息率TTM
     */
    @JsonProperty("dv_ttm")
    public BigDecimal c7;

    /**
     * 总市值
     */
    @JsonProperty("total_mv")
    public BigDecimal c8;

}
