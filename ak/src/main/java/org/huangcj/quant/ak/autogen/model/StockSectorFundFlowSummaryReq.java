package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSectorFundFlowSummaryReq {
    /**
     * symbol="电源设备"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="今日"; choice of {"今日", "5日", "10日"}
     */
    @AkParam("indicator")
    public String indicator;

}
