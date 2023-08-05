package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockABelowNetAssetStatisticsRes {
    /**
     * 交易日
     */
    @JsonProperty("date")
    public String c0;

    /**
     * 破净股家数
     */
    @JsonProperty("below_net_asset")
    public BigDecimal c1;

    /**
     * 总公司数
     */
    @JsonProperty("total_company")
    public BigDecimal c2;

    /**
     * 破净股比率
     */
    @JsonProperty("below_net_asset_ratio")
    public BigDecimal c3;

}
