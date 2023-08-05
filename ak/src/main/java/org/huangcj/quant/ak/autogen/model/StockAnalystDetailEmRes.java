package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockAnalystDetailEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("股票代码")
    public String c1;

    @JsonProperty("股票名称")
    public String c2;

    @JsonProperty("调入日期")
    public String c3;

    @JsonProperty("最新评级日期")
    public String c4;

    @JsonProperty("当前评级名称")
    public String c5;

    @JsonProperty("成交价格(前复权)")
    public BigDecimal c6;

    @JsonProperty("最新价格")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("阶段涨跌幅")
    public BigDecimal c8;

}
