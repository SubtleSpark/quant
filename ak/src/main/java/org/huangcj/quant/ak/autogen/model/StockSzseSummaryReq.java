package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSzseSummaryReq {
    /**
     * date="20200619"; 当前交易日的数据需要交易所收盘后统计
     */
    @AkParam("date")
    public String date;

}
