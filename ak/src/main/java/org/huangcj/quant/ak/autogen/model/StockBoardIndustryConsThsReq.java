package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardIndustryConsThsReq {
    /**
     * symbol="半导体及元件"; 可以通过调用 **ak.stock_board_industry_name_ths()** 查看同花顺的所有行业名称
     */
    @AkParam("symbol")
    public String symbol;

}
