package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockInfoSzDelistReq {
    /**
     * symbol="终止上市公司"; choice of {"暂停上市公司", "终止上市公司"}
     */
    @AkParam("symbol")
    public String symbol;

}
