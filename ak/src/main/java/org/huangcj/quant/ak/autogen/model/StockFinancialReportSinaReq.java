package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFinancialReportSinaReq {
    /**
     * stock="sh600600"; 带市场标识的股票代码
     */
    @AkParam("stock")
    public String stock;

    /**
     * symbol="现金流量表"; choice of {"资产负债表", "利润表", "现金流量表"}
     */
    @AkParam("symbol")
    public String symbol;

}
