package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockMarketPbLgReq {
    /**
     * symbol="上证"; choice of {"上证", "深证", "创业板", "科创版"}
     */
    @AkParam("symbol")
    public String symbol;

}
