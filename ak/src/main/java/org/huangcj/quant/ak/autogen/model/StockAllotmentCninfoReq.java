package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockAllotmentCninfoReq {
    /**
     * symbol="600030"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="19700101"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="22220222"
     */
    @AkParam("end_date")
    public String endDate;

}
