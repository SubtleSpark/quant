package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockDzjyMrtjReq {
    /**
     * start_date='20220105'; 开始日期
     */
    @AkParam("start_date")
    public String startDate;

    /**
     * end_date='20220105'; 结束日期
     */
    @AkParam("end_date")
    public String endDate;

}
