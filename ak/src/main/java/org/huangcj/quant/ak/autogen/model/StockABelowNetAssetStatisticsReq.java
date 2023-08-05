package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockABelowNetAssetStatisticsReq {
    /**
     * symbol="全部A股"; choice of {"全部A股", "沪深300"}
     */
    @AkParam("symbol")
    public String symbol;

}
