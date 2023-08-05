package org.huangcj.quant.ak.autogen.model;

import org.huangcj.quant.ak.annotation.AkParam;

public class StockSectorDetailReq {
    /**
     * sector="hangye_ZL01"; 通过 **ak.stock_sector_spot** 返回数据的 label 字段选择 sector
     */
    @AkParam("sector")
    public String sector;

}
