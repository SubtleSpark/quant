package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockUsHistFuReq {
    /**
     * 美股代码; 调用 ak.stock_us_code_table_fu() 函数获取 `代码` 字段
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * start_date="20210101"
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date="20210601"
     */
    @AkParam("end_date")
    public String endDate;

}
