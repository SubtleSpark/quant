package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockIndividualFundFlowRankReq {
    /**
     * indicator="今日"; choice {"今日", "3日", "5日", "10日"}
     */
    @AkParam("indicator")
    public String indicator;

}
