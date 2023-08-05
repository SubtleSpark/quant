package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockIndustryPeRatioCninfoReq {
    /**
     * symbol="证监会行业分类"; choice of {"证监会行业分类", "国证行业分类"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20210910"; 交易日
     */
    @AkParam("date")
    public String date;

}
