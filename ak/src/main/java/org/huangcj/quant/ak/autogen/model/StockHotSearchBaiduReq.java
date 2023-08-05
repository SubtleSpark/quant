package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHotSearchBaiduReq {
    /**
     * symbol="A股"; choice of {"全部", "A股", "港股", "美股"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20230421"
     */
    @AkParam("date")
    public String date;

    /**
     * time="今日"; choice of {"今日", "1小时"}
     */
    @AkParam("time")
    public String time;

}
