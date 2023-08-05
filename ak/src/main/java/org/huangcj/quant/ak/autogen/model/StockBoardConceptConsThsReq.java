package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardConceptConsThsReq {
    /**
     * symbol="阿里巴巴概念"; 可以通过调用 **ak.stock_board_concept_name_ths()** 查看同花顺的所有概念名称; 注意：其中 "国家大基金持股" 为 "国家大基金持股 ", 最后有一个空格
     */
    @AkParam("symbol")
    public String symbol;

}
