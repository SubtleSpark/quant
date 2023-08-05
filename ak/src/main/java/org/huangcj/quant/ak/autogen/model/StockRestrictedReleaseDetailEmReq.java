package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockRestrictedReleaseDetailEmReq {
    /**
     * start_date="20221202"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20241202"
     */
    @AkParam("end_date")
    public String endDate;

}
