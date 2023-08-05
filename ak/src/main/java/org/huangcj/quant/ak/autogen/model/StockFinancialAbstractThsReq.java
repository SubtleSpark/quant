package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFinancialAbstractThsReq {
    /**
     * symbol="000063"; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="按报告期"; choice of {"按报告期", "按年度", "按单季度"}
     */
    @AkParam("indicator")
    public String indicator;

}
