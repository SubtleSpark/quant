package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockCommentEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c5;

    @JsonProperty("市盈率")
    public BigDecimal c6;

    @JsonProperty("主力成本")
    public BigDecimal c7;

    @JsonProperty("机构参与度")
    public BigDecimal c8;

    @JsonProperty("综合得分")
    public BigDecimal c9;

    /**
     * 注意: 正负号
     */
    @JsonProperty("上升")
    public Long c10;

    @JsonProperty("目前排名")
    public Long c11;

    @JsonProperty("关注指数")
    public BigDecimal c12;

    @JsonProperty("交易日")
    public BigDecimal c13;

}
