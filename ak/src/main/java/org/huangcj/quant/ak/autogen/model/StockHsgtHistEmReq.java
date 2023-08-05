package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtHistEmReq {
    /**
     * symbol="港股通沪"; choice of {"沪股通", "深股通", "港股通沪", "港股通深"}
     */
    @AkParam("symbol")
    public String symbol;

}
