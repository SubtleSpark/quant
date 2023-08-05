package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhAHistReq {
    /**
     * symbol='603777'; 股票代码可以在 **ak.stock_zh_a_spot_em()** 中获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * period='daily'; choice of {'daily', 'weekly', 'monthly'}
     */
    @AkParam("period")
    public String period;

    /**
     * start_date='20210301'; 开始查询的日期
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date='20210616'; 结束查询的日期
     */
    @AkParam("end_date")
    public String endDate;

    /**
     * 默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据
     */
    @AkParam("adjust")
    public String adjust;

    /**
     * timeout=None; 默认不设置超时参数
     */
    @AkParam("timeout")
    public String timeout;

}
