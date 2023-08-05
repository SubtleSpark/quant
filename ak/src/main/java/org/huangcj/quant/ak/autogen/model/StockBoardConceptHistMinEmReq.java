package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardConceptHistMinEmReq {
    /**
     * symbol="长寿药"; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有概念代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period="5"; choice of {"1", "5", "15", "30", "60"}
     */
    @AkParam("period")
    public String period;

}
