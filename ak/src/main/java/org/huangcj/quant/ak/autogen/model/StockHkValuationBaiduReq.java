package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHkValuationBaiduReq {
    /**
     * symbol="02358"; 港股代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * indicator="总市值"; choice of {"总市值", "市盈率(TTM)", "市盈率(静)", "市净率", "市现率"}
     */
    @AkParam("indicator")
    public String indicator;

    /**
     * period="近一年"; choice of {"近一年", "近三年", "近五年", "近十年", "全部"}
     */
    @AkParam("period")
    public String period;

}
