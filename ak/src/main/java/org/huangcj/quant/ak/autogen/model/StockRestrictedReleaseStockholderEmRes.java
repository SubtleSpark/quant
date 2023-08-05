package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRestrictedReleaseStockholderEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    /**
     * 注意单位: 股
     */
    @JsonProperty("解禁数量")
    public Long c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("实际解禁数量")
    public Long c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("解禁市值")
    public BigDecimal c4;

    /**
     * 注意单位: 月
     */
    @JsonProperty("锁定期")
    public Long c5;

    /**
     * 注意单位: 股
     */
    @JsonProperty("剩余未解禁数量")
    public Long c6;

    @JsonProperty("限售股类型")
    public String c7;

    @JsonProperty("进度")
    public String c8;

}
