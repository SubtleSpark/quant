package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockAIndicatorLgReq {
    /**
     * symbol="000001"; 参见 **ak.stock_a_indicator_lg(symbol="all")** 获取股票代码
     */
    @AkParam("symbol")
    public String symbol;

}
