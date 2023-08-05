package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockLhbJgzzSinaReq {
    /**
     * recent_day="5"; choice of {"5": 最近 5 天; "10": 最近 10 天; "30": 最近 30 天; "60": 最近 60 天;}
     */
    @AkParam("recent_day")
    public String recentDay;

}
