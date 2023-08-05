package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSseDealDailyReq {
    /**
     * date="20200619"; 当前交易日的数据需要交易所收盘后统计; 注意在 20211227（包含）之后输出格式变化
     */
    @AkParam("date")
    public String date;

}
