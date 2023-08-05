package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhAMinuteReq {
    /**
     * symbol='sh000300'; 同日频率数据接口
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period='1'; 获取 1, 5, 15, 30, 60 分钟的数据频率
     */
    @AkParam("period")
    public String period;

    /**
     * adjust=""; 默认为空: 返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据;
     */
    @AkParam("adjust")
    public String adjust;

}
