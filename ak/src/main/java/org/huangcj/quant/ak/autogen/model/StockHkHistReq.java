package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHkHistReq {
    /**
     * symbol="00593"; 港股代码,可以通过 **ak.stock_hk_spot_em()** 函数返回所有港股代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period='daily'; choice of {'daily', 'weekly', 'monthly'}
     */
    @AkParam("period")
    public String period;

    /**
     * start_date="19700101"; 开始日期
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="22220101"; 结束日期
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * adjust="": 返回未复权的数据, 默认; qfq: 返回前复权数据; hfq: 返回后复权数据;
     */
    @AkParam("adjust")
    public String adjust;

}
