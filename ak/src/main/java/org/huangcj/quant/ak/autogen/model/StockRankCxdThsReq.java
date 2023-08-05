package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRankCxdThsReq {
    /**
     * symbol="创月新低"; choice of {"创月新低", "半年新低", "一年新低", "历史新低"}
     */
    @AkParam("symbol")
    public String symbol;

}
