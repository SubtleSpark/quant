package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardConceptHistEmReq {
    /**
     * symbol="网络安全"; 可以通过调用 **ak.stock_board_concept_name_em()** 查看东方财富-概念板块的所有概念代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period="daily"; choice of {"daily", "weekly", "monthly"}
     */
    @AkParam("period")
    public String period;

    /**
     * start_date="20220101"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20221128"
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * adjust=""; choice of {'': 不复权, 默认; "qfq": 前复权, "hfq": 后复权}
     */
    @AkParam("adjust")
    public String adjust;

}
