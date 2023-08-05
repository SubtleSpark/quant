package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRestrictedReleaseStockholderEmReq {
    /**
     * symbol="600000"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20200904"; 通过 ak.stock_restricted_release_queue_em(symbol="600000") 获取
     */
    @AkParam("date")
    public String date;

}
