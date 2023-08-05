package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockIndividualFundFlowReq {
    /**
     * stock="000425"; 股票代码
     */
    @AkParam("stock")
    public String stock;

    /**
     * market="sh"; 上海证券交易所: sh, 深证证券交易所: sz, 北京证券交易所: bj
     */
    @AkParam("market")
    public String market;

}
