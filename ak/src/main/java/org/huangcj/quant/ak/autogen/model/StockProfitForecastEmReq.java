package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockProfitForecastEmReq {
    /**
     * symbol="", 默认为获取全部数据; symbol="船舶制造", 则获取具体行业板块的数据; 行业板块可以通过 ak.stock_board_industry_name_em() 接口获取
     */
    @AkParam("symbol")
    public String symbol;

}
