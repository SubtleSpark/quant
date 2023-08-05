package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRestrictedReleaseSummaryEmReq {
    /**
     * symbol="全部股票"; choice of {"全部股票", "沪市A股", "科创板", "深市A股", "创业板", "京市A股"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20221101"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20221209"
     */
    @AkParam("end_date")
    public String endDate;

}
