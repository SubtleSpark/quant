package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockReportDisclosureReq {
    /**
     * market="沪深京"; choice of {"沪深京", "深市", "深主板", "创业板", "沪市", "沪主板", "科创板", "北交所"}
     */
    @AkParam("market")
    public String market;

    /**
     * period="2021年报"; 近四期的财务报告; e.g., choice of {"2021一季", "2021半年报", "2021三季", "2021年报"}
     */
    @AkParam("period")
    public String period;

}
