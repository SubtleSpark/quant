package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockFinancialHkReportEmRes {
    @JsonProperty("SECUCODE")
    public String c0;

    @JsonProperty("SECURITY_CODE")
    public String c1;

    @JsonProperty("SECURITY_NAME_ABBR")
    public String c2;

    @JsonProperty("ORG_CODE")
    public String c3;

    @JsonProperty("REPORT_DATE")
    public String c4;

    @JsonProperty("DATE_TYPE_CODE")
    public String c5;

    @JsonProperty("FISCAL_YEAR")
    public String c6;

    @JsonProperty("STD_ITEM_CODE")
    public String c7;

    @JsonProperty("STD_ITEM_NAME")
    public String c8;

    @JsonProperty("AMOUNT")
    public BigDecimal c9;

    @JsonProperty("STD_REPORT_DATE")
    public String c10;

}
