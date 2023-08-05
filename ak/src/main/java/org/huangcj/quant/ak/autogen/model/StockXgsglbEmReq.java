package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockXgsglbEmReq {
    /**
     * symbol="全部股票"; choice of {"全部股票", "沪市A股", "科创板", "深市A股", "创业板", "京市A股"}
     */
    @AkParam("symbol")
    public String symbol;

}
