package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardConceptConsEmReq {
    /**
     * symbol="车联网"; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有行业名称
     */
    @AkParam("symbol")
    public String symbol;

}
