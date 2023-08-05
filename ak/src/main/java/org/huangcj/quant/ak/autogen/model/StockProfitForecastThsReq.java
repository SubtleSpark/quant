package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockProfitForecastThsReq {
    /**
     * symbol="600519"; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="预测年报每股收益"; choice of {"预测年报每股收益", "预测年报净利润", "业绩预测详表-机构", "业绩预测详表-详细指标预测"}
     */
    @AkParam("indicator")
    public String indicator;

}
