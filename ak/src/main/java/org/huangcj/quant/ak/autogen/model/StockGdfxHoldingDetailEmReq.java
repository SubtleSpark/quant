package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockGdfxHoldingDetailEmReq {
    /**
     * date="20230331"; 财报发布季度最后日
     */
    @AkParam("date")
    public String date;

    /**
     * indicator="个人"; 股东类型; choice of {"个人", "基金", "QFII", "社保", "券商", "信托"}
     */
    @AkParam("indicator")
    public String indicator;

    /**
     * symbol="新进"; 持股变动; choice of {"新进", "增加", "不变", "减少"}
     */
    @AkParam("symbol")
    public String symbol;

}
