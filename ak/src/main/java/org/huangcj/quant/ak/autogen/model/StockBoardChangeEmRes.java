package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockBoardChangeEmRes {
    @JsonProperty("板块名称")
    public String c0;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c1;

    /**
     * 注意单位: 万元
     */
    @JsonProperty("主力净流入")
    public BigDecimal c2;

    @JsonProperty("板块异动总次数")
    public BigDecimal c3;

    @JsonProperty("板块异动最频繁个股及所属类型-股票代码")
    public String c4;

    @JsonProperty("板块异动最频繁个股及所属类型-股票名称")
    public String c5;

    @JsonProperty("板块异动最频繁个股及所属类型-买卖方向")
    public String c6;

    /**
     * 返回具体异动的字典
     */
    @JsonProperty("板块具体异动类型列表及出现次数")
    public String c7;

}
