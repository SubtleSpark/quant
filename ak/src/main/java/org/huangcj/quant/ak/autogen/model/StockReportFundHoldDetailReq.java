package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockReportFundHoldDetailReq {
    /**
     * symbol="005827"; 基金代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20200630"; 财报发布日期, xxxx-03-31, xxxx-06-30, xxxx-09-30, xxxx-12-31
     */
    @AkParam("date")
    public String date;

}
