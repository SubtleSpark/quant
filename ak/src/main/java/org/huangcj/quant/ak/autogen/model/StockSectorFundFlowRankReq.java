package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSectorFundFlowRankReq {
    /**
     * indicator="5日"; choice of {"今日", "5日", "10日"}
     */
    @AkParam("indicator")
    public String indicator;

    /**
     * sector_type="地域资金流"; choice of {"行业资金流": "2", "概念资金流": "3", "地域资金流": "1"}
     */
    @AkParam("sector_type")
    public String sectorType;

}
