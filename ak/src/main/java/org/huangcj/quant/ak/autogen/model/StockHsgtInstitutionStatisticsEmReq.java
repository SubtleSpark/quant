package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtInstitutionStatisticsEmReq {
    /**
     * market="北向持股"; choice of {"北向持股", "沪股通持股", "深股通持股", "南向持股"}
     */
    @AkParam("market")
    public String market;

    /**
     * start_date="20201218"; 此处指定近期交易日
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20201218"; 此处指定近期交易日
     */
    @AkParam("end_date")
    public String endDate;

}
