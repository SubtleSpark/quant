package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockInfoSzChangeNameReq {
    /**
     * symbol="全称变更"; choice of {"全称变更", "简称变更"}
     */
    @AkParam("symbol")
    public String symbol;

}
