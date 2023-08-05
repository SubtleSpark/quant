package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhADailyReq {
    /**
     * symbol='sh600000'; 股票代码可以在 **ak.stock_zh_a_spot()** 中获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date='20201103'; 开始查询的日期
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date='20201116'; 结束查询的日期
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * 默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; hfq-factor: 返回后复权因子; qfq-factor: 返回前复权因子
     */
    @AkParam("adjust")
    public String adjust;

}
