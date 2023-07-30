package org.huangcj.quant.akJ.AkModel;

import java.math.BigDecimal;

/**
 * <blockquote><pre>
 * {
 *     "日期": "2021-03-01T00:00:00.000",
 *     "开盘": 10.43,
 *     "收盘": 10.64,
 *     "最高": 10.67,
 *     "最低": 10.41,
 *     "成交量": 16159,
 *     "成交额": 17006677,
 *     "振幅": 2.5,
 *     "涨跌幅": 2.11,
 *     "涨跌额": 0.22,
 *     "换手率": 0.48
 * }
 * </pre></blockquote>
 *
 * @author HuangChengJun
 * @date 2023/7/30 17:47
 */
public class StockZhAHistRes {
    /**
     * "日期": "2021-03-01T00:00:00.000"
     */
    public String date;
    public BigDecimal open;
    public BigDecimal close;
    public BigDecimal high;
    public BigDecimal low;
    /**
     * "成交量": 16159
     */
    public BigDecimal volume;
    /**
     * "成交额": 17006677
     */
    public BigDecimal amount;

    /**
     * "振幅": 2.5
     */
    public BigDecimal amplitude;

    /**
     * "涨跌幅": 2.11
     */
    public BigDecimal changeRate;

    /**
     * "涨跌额": 0.22
     */
    public BigDecimal changeAmount;

    /**
     * "换手率": 0.48
     */
    public BigDecimal turnoverRate;
}
