package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHistoryDividendDetailReq {
    /**
     * symbol="600012"; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="配股"; choice of {"分红", "配股"}
     */
    @AkParam("indicator")
    public String indicator;

    /**
     * date="1994-12-24"; 分红配股的具体日期, e.g., "1994-12-24"
     */
    @AkParam("date")
    public String date;

}
