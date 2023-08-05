package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockAHighLowStatisticsReq {
    /**
     * market="all"; {"all": "全部A股", "sz50": "上证50", "hs300": "沪深300", "zz500": "中证500"}
     */
    @AkParam("market")
    public String market;

}
