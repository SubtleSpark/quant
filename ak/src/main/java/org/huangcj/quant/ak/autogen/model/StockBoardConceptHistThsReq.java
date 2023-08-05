package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardConceptHistThsReq {
    /**
     * start_year='2000'; 指定开始年份
     */
    @AkParam("start_year")
    public String startYear;

    /**
     * symbol="阿里巴巴概念"; 可以通过调用 **ak.stock_board_concept_name_ths()** 查看同花顺的所有概念名称
     */
    @AkParam("symbol")
    public String symbol;

}
