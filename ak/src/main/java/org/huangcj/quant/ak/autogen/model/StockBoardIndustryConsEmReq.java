package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardIndustryConsEmReq {
    /**
     * symbol="小金属"; 可以通过调用 **ak.stock_board_industry_name_em()** 查看东方财富-行业板块的所有行业代码
     */
    @AkParam("symbol")
    public String symbol;

}
