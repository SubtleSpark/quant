package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockZhKcbReportEmReq {
    /**
     * from_page=1; 始获取的页码
     */
    @AkParam("from_page")
    public String fromPage;

    /**
     * to_page=100; 结束获取的页码
     */
    @AkParam("to_page")
    public String toPage;

}
