package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHkDailyReq {
    /**
     * 港股代码,可以通过 **ak.stock_hk_spot()** 函数返回所有港股代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * "": 返回未复权的数据 ; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; qfq-factor: 返回前复权因子和调整; hfq-factor: 返回后复权因子和调整;
     */
    @AkParam("adjust")
    public String adjust;

}
