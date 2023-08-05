package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZcfzEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票简称")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("资产-货币资金")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("资产-应收账款")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("资产-存货")
    public BigDecimal c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("资产-总资产")
    public BigDecimal c6;

    /**
     * 注意单位: %
     */
    @JsonProperty("资产-总资产同比")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("负债-应付账款")
    public BigDecimal c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("负债-总负债")
    public BigDecimal c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("负债-预收账款")
    public BigDecimal c10;

    /**
     * 注意单位: %
     */
    @JsonProperty("负债-总负债同比")
    public BigDecimal c11;

    /**
     * 注意单位: %
     */
    @JsonProperty("资产负债率")
    public BigDecimal c12;

    /**
     * 注意单位: 元
     */
    @JsonProperty("股东权益合计")
    public BigDecimal c13;

    @JsonProperty("公告日期")
    public String c14;

}
