package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCommentDetailScrdFocusEmRes {
    @JsonProperty("日期")
    public String c0;

    @JsonProperty("用户关注指数")
    public BigDecimal c1;

    @JsonProperty("收盘价")
    public BigDecimal c2;

}
