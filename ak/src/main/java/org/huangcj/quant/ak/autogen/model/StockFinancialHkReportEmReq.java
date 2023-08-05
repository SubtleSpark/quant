package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFinancialHkReportEmReq {
    /**
     * stock="00700"; 股票代码
     */
    @AkParam("stock")
    public String stock;

    /**
     * symbol="现金流量表"; choice of {"资产负债表", "利润表", "现金流量表"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * symbol="年度"; choice of {"年度", "报告期"}
     */
    @AkParam("indicator")
    public String indicator;

}
