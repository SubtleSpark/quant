package org.huangcj.quant.akJ;

import jakarta.annotation.PostConstruct;
import org.huangcj.quant.akJ.AkModel.StockZhAHistReq;
import org.huangcj.quant.akJ.AkModel.StockZhAHistRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author HuangChengJun
 * @date 2023/7/30 17:44
 */
@Component
public class AkInterface {
    @Autowired
    private RestTemplate restTemplate;


    public StockZhAHistRes stockZhAHist(StockZhAHistReq req) {
        restTemplate.postForEntity("http://120.48.75.227:31751/api/public/stock_zh_a_hist", req, StockZhAHistRes.class);
        return null;
    }

    @PostConstruct
    public void test() {
        StockZhAHistReq req = new StockZhAHistReq();
        req.symbol = "603777";
        req.period = "daily";
        req.start_date = "20210301";
        req.end_date = "20210616";
        req.adjust = "qfq";
        ResponseEntity<Object> res = restTemplate.getForEntity("http://120.48.75.227:31751/api/public/stock_zh_a_hist", Object.class, req);
        Object body = res.getBody();
    }
}
