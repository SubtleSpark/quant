package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRankCxgThsReq {
    /**
     * symbol="创月新高"; choice of {"创月新高", "半年新高", "一年新高", "历史新高"}
     */
    @AkParam("symbol")
    public String symbol;

}
