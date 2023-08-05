package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockLrbEmReq {
    /**
     * date="20200331"; choice of {"XXXX0331", "XXXX0630", "XXXX0930", "XXXX1231"}; 从 20120331 开始
     */
    @AkParam("date")
    public String date;

}
