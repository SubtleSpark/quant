package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhACdrDailyReq {
    /**
     * symbol='sh689009'; CDR 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date='20201103'
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date='20201116'
     */
    @AkParam("end_date")
    public String endDate;

}
