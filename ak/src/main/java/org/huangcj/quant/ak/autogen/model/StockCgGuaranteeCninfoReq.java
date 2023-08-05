package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockCgGuaranteeCninfoReq {
    /**
     * symbol="全部"; choice of {"全部", "深市主板", "沪市", "创业板", "科创板"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20180630"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20210927"
     */
    @AkParam("end_date")
    public String endDate;

}
