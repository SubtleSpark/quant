package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtSouthCashEmReq {
    /**
     * symbol="沪股通"; choice of {"沪股通", "深股通", "南下"}
     */
    @AkParam("symbol")
    public String symbol;

}
