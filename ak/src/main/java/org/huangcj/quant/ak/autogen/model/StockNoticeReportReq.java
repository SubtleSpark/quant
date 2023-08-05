package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockNoticeReportReq {
    /**
     * symbol='财务报告'; choice of {"全部", "重大事项", "财务报告", "融资公告", "风险提示", "资产重组", "信息变更", "持股变动"}
     */
    @AkParam("symbol")
    public String symbol;

    /**
     * date="20220511"; 指定日期
     */
    @AkParam("date")
    public String date;

}
