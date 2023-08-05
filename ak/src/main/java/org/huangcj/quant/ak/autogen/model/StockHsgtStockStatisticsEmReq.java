package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtStockStatisticsEmReq {
    /**
     * symbol="北向持股"; choice of {"北向持股", "沪股通持股", "深股通持股", "南向持股"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20210601"; 此处指定近期交易日
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20210608"; 此处指定近期交易日
     */
    @AkParam("end_date")
    public String endDate;

}
