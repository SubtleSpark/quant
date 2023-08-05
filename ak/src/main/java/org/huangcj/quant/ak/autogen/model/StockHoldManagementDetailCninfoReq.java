package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHoldManagementDetailCninfoReq {
    /**
     * symbol="增持"; choice of {"增持", "减持"}
     */
    @AkParam("symbol")
    public String symbol;

}
