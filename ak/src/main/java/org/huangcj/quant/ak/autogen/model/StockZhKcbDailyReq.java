package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhKcbDailyReq {
    /**
     * symbol="sh688008"; 带市场标识的股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * 默认不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据; hfq-factor: 返回后复权因子; hfq-factor: 返回前复权因子
     */
    @AkParam("adjust")
    public String adjust;

}
