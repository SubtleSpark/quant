package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockFhpsEmReq {
    /**
     * date="20201231"; choice of {"XXXX0630", "XXXX1231"}; 从 19901231 开始
     */
    @AkParam("date")
    public String date;

}
