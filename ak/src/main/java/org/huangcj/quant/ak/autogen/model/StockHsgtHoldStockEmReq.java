package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtHoldStockEmReq {
    /**
     * market="沪股通"; choice of {"北向", "沪股通", "深股通"}
     */
    @AkParam("market")
    public String market;

    /**
     * indicator="沪股通"; choice of {"今日排行", "3日排行", "5日排行", "10日排行", "月排行", "季排行", "年排行"}
     */
    @AkParam("indicator")
    public String indicator;

}
