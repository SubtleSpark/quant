package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtNorthAccFlowInEmReq {
    /**
     * symbol="沪股通"; choice of {"沪股通", "深股通", "北上"}
     */
    @AkParam("symbol")
    public String symbol;

}
