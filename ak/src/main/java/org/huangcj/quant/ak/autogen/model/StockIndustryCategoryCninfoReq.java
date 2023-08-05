package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockIndustryCategoryCninfoReq {
    /**
     * symbol="巨潮行业分类标准"; choice of {"证监会行业分类标准", "巨潮行业分类标准", "申银万国行业分类标准", "新财富行业分类标准", "国资委行业分类标准", "巨潮产业细分标准", "天相行业分类标准", "全球行业分类标准"}
     */
    @AkParam("symbol")
    public String symbol;

}
