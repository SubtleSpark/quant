package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockAGxlLgReq {
    /**
     * symbol="上证A股"; choice of {"上证A股", "深证A股", "创业板", "科创板"}
     */
    @AkParam("symbol")
    public String symbol;

}
