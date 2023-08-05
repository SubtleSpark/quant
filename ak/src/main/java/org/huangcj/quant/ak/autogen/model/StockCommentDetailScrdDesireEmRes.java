package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCommentDetailScrdDesireEmRes {
    @JsonProperty("日期时间")
    public String c0;

    @JsonProperty("大户")
    public BigDecimal c1;

    @JsonProperty("全部")
    public BigDecimal c2;

    @JsonProperty("散户")
    public BigDecimal c3;

}
