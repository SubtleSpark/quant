package org.huangcj.quant.akJ.AkModel;

/**
 * symbol,string,false,603777,股票代码可以在 ak.stock_zh_a_spot_em() 中获取,false
 * period,string,false,daily,"choice of {'daily', 'weekly', 'monthly'}",false
 * start_date,string,false,20210301,开始查询的日期,false
 * end_date,string,false,20210616,结束查询的日期,false
 * adjust,string,false,,默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据,false
 *
 * @author HuangChengJun
 * @date 2023/7/30 21:59
 */
public class StockZhAHistReq {
    /**
     * 股票代码可以在 ak.stock_zh_a_spot_em() 中获取。<br/>
     * 示例值：603777。
     */
    public String symbol;
    /**
     * choice of {'daily', 'weekly', 'monthly'}。<br/>
     * 示例值：daily。
     */
    public String period;
    /**
     * 开始查询的日期。<br/>
     * 示例值：20210301。
     */
    public String start_date;
    /**
     * 结束查询的日期。<br/>
     * 示例值：20210616。
     */
    public String end_date;
    /**
     * 默认返回不复权的数据; qfq: 返回前复权后的数据; hfq: 返回后复权后的数据。<br/>
     * 示例值：qfq。
     */
    public String adjust;
}
