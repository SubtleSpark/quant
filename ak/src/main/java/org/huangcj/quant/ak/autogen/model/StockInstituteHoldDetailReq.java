package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockInstituteHoldDetailReq {
    /**
     * stock="300003"; 股票代码
     */
    @AkParam("stock")
    public String stock;

    /**
     * quarter="20201"; 从 2005 年开始, {"一季报":1, "中报":2 "三季报":3 "年报":4}, e.g., "20191", 其中的 1 表示一季报; "20193", 其中的 3 表示三季报;
     */
    @AkParam("quarter")
    public String quarter;

}
