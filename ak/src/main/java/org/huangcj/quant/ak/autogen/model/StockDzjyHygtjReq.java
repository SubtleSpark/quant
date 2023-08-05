package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockDzjyHygtjReq {
    /**
     * symbol='近三月'; choice of {'近一月', '近三月', '近六月', '近一年'}
     */
    @AkParam("symbol")
    public String symbol;

}
