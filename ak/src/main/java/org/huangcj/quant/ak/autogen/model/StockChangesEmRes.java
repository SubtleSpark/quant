package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockChangesEmRes {
    @JsonProperty("时间")
    public String c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("板块")
    public String c3;

    /**
     * 注意: 不同的 symbol 的单位不同
     */
    @JsonProperty("相关信息")
    public String c4;

}
