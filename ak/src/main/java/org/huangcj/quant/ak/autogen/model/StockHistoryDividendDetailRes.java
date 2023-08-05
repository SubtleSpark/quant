package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHistoryDividendDetailRes {
    @JsonProperty("公告日期")
    public String c0;

    /**
     * 注意单位: 股
     */
    @JsonProperty("送股")
    public Long c1;

    /**
     * 注意单位: 股
     */
    @JsonProperty("转增")
    public Long c2;

    /**
     * 注意单位: 元; 税前
     */
    @JsonProperty("派息")
    public BigDecimal c3;

    @JsonProperty("进度")
    public String c4;

    @JsonProperty("除权除息日")
    public String c5;

    @JsonProperty("股权登记日")
    public String c6;

    @JsonProperty("红股上市日")
    public String c7;

}
