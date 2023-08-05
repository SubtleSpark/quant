package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockGdfxTop10EmReq {
    /**
     * symbol="sh688686"; 带市场标识的股票代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20210630"; 财报发布季度最后日
     */
    @AkParam("date")
    public String date;

}
