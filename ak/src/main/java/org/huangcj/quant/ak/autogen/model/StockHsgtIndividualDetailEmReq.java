package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHsgtIndividualDetailEmReq {
    /**
     * symbol="002008"
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20210830"; 注意只能返回离最近交易日 90 个交易日内的数据
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20211026"; 注意只能返回离最近交易日 90 个交易日内的数据
     */
    @AkParam("end_date")
    public String endDate;

}
