package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtBoardRankEmReq {
    /**
     * symbol="北向资金增持行业板块排行"; choice of {"北向资金增持行业板块排行", "北向资金增持概念板块排行", "北向资金增持地域板块排行"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="今日"; choice of {"今日", "3日", "5日", "10日", "1月", "1季", "1年"}
     */
    @AkParam("indicator")
    public String indicator;

}
