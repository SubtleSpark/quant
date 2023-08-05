package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockAnalystDetailEmReq {
    /**
     * analyst_id="11000257131"; 分析师ID, 从 ak.stock_analyst_rank_em() 获取
     */
    @AkParam("analyst_id")
    public String analystId;

    /**
     * indicator="最新跟踪成分股"; 从 {"最新跟踪成分股", "历史跟踪成分股", "历史指数"} 中选择一个
     */
    @AkParam("indicator")
    public String indicator;

}
