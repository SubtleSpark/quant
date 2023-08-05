package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockLhbTraderstatisticEmReq {
    /**
     * symbol="近一月"; choice of {"近一月", "近三月", "近六月", "近一年"}
     */
    @AkParam("symbol")
    public String symbol;

}
