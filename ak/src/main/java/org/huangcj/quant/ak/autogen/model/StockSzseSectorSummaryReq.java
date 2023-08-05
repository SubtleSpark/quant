package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSzseSectorSummaryReq {
    /**
     * symbol="当月"; choice of {"当月", "当年"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="202203"; 年月
     */
    @AkParam("date")
    public String date;

}
