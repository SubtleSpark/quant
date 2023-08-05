package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSectorSpotReq {
    /**
     * indicator="新浪行业"; choice of {"新浪行业", "启明星行业", "概念", "地域", "行业"}
     */
    @AkParam("indicator")
    public String indicator;

}
