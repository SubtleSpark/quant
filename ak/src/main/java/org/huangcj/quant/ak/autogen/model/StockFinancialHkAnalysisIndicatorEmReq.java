package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFinancialHkAnalysisIndicatorEmReq {
    /**
     * symbol="00700"; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="年度"; choice of {"年度", "报告期"}
     */
    @AkParam("indicator")
    public String indicator;

}
