package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsDailyReq {
    /**
     * 美股代码, 可以通过 **ak.get_us_stock_name()** 函数返回所有美股代码, 由于美股数据量大, 建议按需要获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * adjust="qfq" 则返回前复权后的数据，默认 adjust="", 则返回未复权的数据
     */
    @AkParam("adjust")
    public String adjust;

}
