package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockPriceJsReq {
    /**
     * symbol="us"; choice of {"us", "hk"}
     */
    @AkParam("symbol")
    public String symbol;

}
