package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsFamousSpotEmReq {
    /**
     * symbol="科技类"; choice of {'科技类', '金融类', '医药食品类', '媒体类', '汽车能源类', '制造零售类'}
     */
    @AkParam("symbol")
    public String symbol;

}
