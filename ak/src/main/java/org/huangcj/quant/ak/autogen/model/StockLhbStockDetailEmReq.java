package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockLhbStockDetailEmReq {
    /**
     * symbol="600077";
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20220310"; 需要通过 ak.stock_lhb_stock_detail_date_em(symbol="600077") 接口获取相应股票的有龙虎榜详情数据的日期
     */
    @AkParam("date")
    public String date;

    /**
     * flag="卖出";  choice of {"买入", "卖出"}
     */
    @AkParam("flag")
    public String flag;

}
