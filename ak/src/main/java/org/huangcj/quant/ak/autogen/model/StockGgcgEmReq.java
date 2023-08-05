package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockGgcgEmReq {
    /**
     * symbol="全部"; choice of {"全部", "股东增持", "股东减持"}
     */
    @AkParam("symbol")
    public String symbol;

}
