package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhAHistMinEmReq {
    /**
     * symbol='sh000300'; 股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="1979-09-01 09:32:00"; 日期时间; 默认返回所有数据
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="2222-01-01 09:32:00"; 日期时间; 默认返回所有数据
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * period='5'; choice of {'1', '5', '15', '30', '60'}; 其中 1 分钟数据返回近 5 个交易日数据且不复权
     */
    @AkParam("period")
    public String period;

    /**
     * adjust=''; choice of {'', 'qfq', 'hfq'}; '': 不复权, 'qfq': 前复权, 'hfq': 后复权, 其中 1 分钟数据返回近 5 个交易日数据且不复权
     */
    @AkParam("adjust")
    public String adjust;

}