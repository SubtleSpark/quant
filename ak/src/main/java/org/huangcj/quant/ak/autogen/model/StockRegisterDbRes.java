package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockRegisterDbRes {
    @JsonProperty("序号")
    public Integer c0;

    @JsonProperty("企业名称")
    public String c1;

    @JsonProperty("经营范围")
    public String c2;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年营业收入-2019")
    public BigDecimal c3;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年净利润-2019")
    public BigDecimal c4;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年研发费用-2019")
    public String c5;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年营业收入-2018")
    public BigDecimal c6;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年净利润-2018")
    public BigDecimal c7;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年研发费用-2018")
    public String c8;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年营业收入-2017")
    public String c9;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年净利润-2017")
    public String c10;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近三年研发费用-2017")
    public String c11;

    /**
     * 注意单位: 元
     */
    @JsonProperty("近两年累计净利润")
    public BigDecimal c12;

}
