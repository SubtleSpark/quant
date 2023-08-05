package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardConceptNameThsRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("概念名称")
    public String c1;

    @JsonProperty("成分股数量")
    public Long c2;

    @JsonProperty("网址")
    public String c3;

    /**
     * 同花顺内部代码
     */
    @JsonProperty("代码")
    public String c4;

}
