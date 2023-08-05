package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsHistMinEmReq {
    /**
     * symbol="105.ATER"; 美股代码可以通过 **ak.stock_us_spot_em()** 函数返回所有的 pandas.DataFrame 里面的 `代码` 字段获取
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="1979-09-01 09:32:00"; 日期时间; 默认返回所有数据
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="2222-01-01 09:32:00"; 日期时间; 默认返回所有数据
     */
    @AkParam("end_date")
    public String endDate;

}
