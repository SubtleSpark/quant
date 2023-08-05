package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockInfoShNameCodeReq {
    /**
     * symbol="主板A股"; choice of {"主板A股", "主板B股", "科创板"}
     */
    @AkParam("symbol")
    public String symbol;

}
