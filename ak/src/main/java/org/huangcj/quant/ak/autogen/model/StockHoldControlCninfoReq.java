package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockHoldControlCninfoReq {
    /**
     * symbol="全部"; choice of {"单独控制", "实际控制人", "一致行动人", "家族控制", "全部"}; 从 2010 开始
     */
    @AkParam("symbol")
    public String symbol;

}
