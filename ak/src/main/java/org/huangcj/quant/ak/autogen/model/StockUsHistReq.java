package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsHistReq {
    /**
     * 美股代码, 可以通过 **ak.stock_us_spot_em()** 函数返回所有的 pandas.DataFrame 里面的 `代码` 字段获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period='daily'; choice of {'daily', 'weekly', 'monthly'}
     */
    @AkParam("period")
    public String period;

    /**
     * start_date="20210101"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20210601"
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * 默认 adjust="", 则返回未复权的数据; adjust="qfq" 则返回前复权的数据, adjust="hfq" 则返回后复权的数据,
     */
    @AkParam("adjust")
    public String adjust;

}
