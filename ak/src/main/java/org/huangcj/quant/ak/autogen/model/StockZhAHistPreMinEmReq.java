package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhAHistPreMinEmReq {
    /**
     * symbol="000001"; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="09:00:00"; 时间; 默认返回所有数据
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="15:40:00"; 时间; 默认返回所有数据
     */
    @AkParam("end_date")
    public String endDate;

}
