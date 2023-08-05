package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhATickTxReq {
    /**
     * symbol="sh600000"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * trade_date="20191011"
     */
    @AkParam("trade_date")
    public String tradeDate;

}
