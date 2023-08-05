package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockInfoSzNameCodeReq {
    /**
     * symbol="A股列表"; choice of {"A股列表", "B股列表", "CDR列表", "AB股列表"}
     */
    @AkParam("symbol")
    public String symbol;

}
