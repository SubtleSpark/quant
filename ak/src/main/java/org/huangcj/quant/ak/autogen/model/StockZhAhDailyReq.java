package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhAhDailyReq {
    /**
     * symbol="02318"; 港股股票代码, 可以通过 **ak.stock_zh_ah_name()** 函数获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_year="2000"; 开始年份
     */
    @AkParam("start_year")
    public String startYear;

    /**
     * end_year="2019"; 结束年份
     */
    @AkParam("end_year")
    public String endYear;

    /**
     * adjust=""; 默认为空不复权; 'qfq': 前复权, 'hfq': 后复权
     */
    @AkParam("adjust")
    public String adjust;

}
