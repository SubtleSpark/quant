package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockDzjyMrmxReq {
    /**
     * symbol='债券'; choice of {'A股', 'B股', '基金', '债券'}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date='20201123'; 开始日期
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date='20201204'; 结束日期
     */
    @AkParam("end_date")
    public String endDate;

}
