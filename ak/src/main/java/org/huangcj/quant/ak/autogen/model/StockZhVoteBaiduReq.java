package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhVoteBaiduReq {
    /**
     * symbol="000001"; A 股股票或指数代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="指数"; choice of {"指数", "股票"}
     */
    @AkParam("indicator")
    public String indicator;

}
