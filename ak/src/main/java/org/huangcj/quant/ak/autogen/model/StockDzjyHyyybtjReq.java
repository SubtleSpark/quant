package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockDzjyHyyybtjReq {
    /**
     * symbol='近3日'; choice of {'当前交易日', '近3日', '近5日', '近10日', '近30日'}
     */
    @AkParam("symbol")
    public String symbol;

}
