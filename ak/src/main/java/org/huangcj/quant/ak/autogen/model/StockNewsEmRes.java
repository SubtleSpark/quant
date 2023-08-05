package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockNewsEmRes {
    @JsonProperty("关键词")
    public String c0;

    @JsonProperty("新闻标题")
    public String c1;

    @JsonProperty("新闻内容")
    public String c2;

    @JsonProperty("发布时间")
    public String c3;

    @JsonProperty("文章来源")
    public String c4;

    @JsonProperty("新闻链接")
    public String c5;

}
