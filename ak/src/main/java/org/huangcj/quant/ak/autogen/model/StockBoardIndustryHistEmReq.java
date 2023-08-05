package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockBoardIndustryHistEmReq {
    /**
     * symbol="小金属"; 可以通过调用 **ak.stock_board_industry_name_em()** 查看东方财富-行业板块的所有行业代码
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20211201";
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20220401";
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * period="日k"; 周期; choice of {"日k", "周k", "月k"}
     */
    @AkParam("period")
    public String period;

    /**
     * adjust=""; choice of {'': 不复权, 默认; "qfq": 前复权, "hfq": 后复权}
     */
    @AkParam("adjust")
    public String adjust;

}
