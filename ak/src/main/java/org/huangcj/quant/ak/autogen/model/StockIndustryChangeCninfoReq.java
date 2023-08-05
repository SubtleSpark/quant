package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockIndustryChangeCninfoReq {
    /**
     * symbol="002594"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20091227"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20220708"
     */
    @AkParam("end_date")
    public String endDate;

}
