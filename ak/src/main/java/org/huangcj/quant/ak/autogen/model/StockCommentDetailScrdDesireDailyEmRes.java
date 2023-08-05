package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCommentDetailScrdDesireDailyEmRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("当日意愿下降")
    public BigDecimal c1;

    @JsonProperty("五日累计意愿")
    public BigDecimal c2;

}
