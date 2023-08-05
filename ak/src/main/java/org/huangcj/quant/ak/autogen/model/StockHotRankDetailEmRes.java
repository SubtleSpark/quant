package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockHotRankDetailEmRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("排名")
    public Long c1;

    @JsonProperty("证券代码")
    public String c2;

    @JsonProperty("新晋粉丝")
    public BigDecimal c3;

    @JsonProperty("铁杆粉丝")
    public BigDecimal c4;

}
