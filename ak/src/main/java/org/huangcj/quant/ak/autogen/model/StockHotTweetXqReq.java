package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHotTweetXqReq {
    /**
     * symbol="最热门"; choice of {"本周新增", "最热门"}
     */
    @AkParam("symbol")
    public String symbol;

}
