package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFundFlowIndustryReq {
    /**
     * symbol="即时"; choice of {“即时”, "3日排行", "5日排行", "10日排行", "20日排行"}
     */
    @AkParam("symbol")
    public String symbol;

}
