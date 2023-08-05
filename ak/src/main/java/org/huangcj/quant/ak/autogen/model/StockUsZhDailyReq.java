package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsZhDailyReq {
    /**
     * symbol="BABA"; 此处 symbol 可以通过调用 **ak.stock_us_zh_spot()** 接口获取
     */
    @AkParam("symbol")
    public String symbol;

}
