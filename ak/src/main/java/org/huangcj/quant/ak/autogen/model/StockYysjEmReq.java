package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockYysjEmReq {
    /**
     * symbol="沪深A股"; choice of {'沪深A股', '沪市A股', '科创板', '深市A股', '创业板', '京市A股', 'ST板'}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20200331"; choice of {"XXXX0331", "XXXX0630", "XXXX0930", "XXXX1231"}; 从 20081231 开始
     */
    @AkParam("date")
    public String date;

}
