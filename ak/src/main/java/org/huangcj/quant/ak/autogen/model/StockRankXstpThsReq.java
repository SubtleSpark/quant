package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRankXstpThsReq {
    /**
     * symbol="500日均线"; choice of {"5日均线", "10日均线", "20日均线", "30日均线", "60日均线", "90日均线", "250日均线", "500日均线"}
     */
    @AkParam("symbol")
    public String symbol;

}
