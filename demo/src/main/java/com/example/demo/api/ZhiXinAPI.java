package com.example.demo.api;

import com.alibaba.fastjson.JSON;
import com.example.demo.io.ZhiXinRequest;
import com.example.demo.io.ZhiXinResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * 知心天气接口API
 */
public class ZhiXinAPI {

    // 要访问的地址
    private String url = "https://api.thinkpage.cn/v3";
    // API密钥（虽然是免费的接口，但是暴露出来不知道会不会有问题~~）
    private String authKey = "?key=xyluxmpsouubmzzp"; //xyluxmpsouubmzzp 自己的
    // 创建默认的httpClient实例
    private CloseableHttpClient client = HttpClients.custom().build();

    /**
     * 发送请求，接收返回信息。
     * 只作为demo，忽略异常，未关闭连接
     */
    public ZhiXinResponse sendRequest(ZhiXinRequest zhiXinRequest) throws IOException {
        // 组装对象
        url = url + zhiXinRequest.getMethod() + authKey;
        if (zhiXinRequest.getLocation() != null) {
            url = url + "&location=" + zhiXinRequest.getLocation();
        }
        if (zhiXinRequest.getStart() != null) {
            url = url + "&start=" + zhiXinRequest.getStart();
        }
        if (zhiXinRequest.getDays() != null) {
            url = url + "&days=" + zhiXinRequest.getDays();
        }
        // 创建http请求(get方式)
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Content-Type", "application/json-rpc");
        System.out.println("httpGet: " + httpGet);
        // 发送请求并接收结果（这里已经接收了到了返回结果，后面的代码只做了一些转换）
        HttpResponse httpResponse = client.execute(httpGet);
        String responseBody = EntityUtils.toString(httpResponse.getEntity());
        ZhiXinResponse zhiXinResponse = JSON.parseObject(responseBody, ZhiXinResponse.class);
        System.out.println("response: " + responseBody);
        return zhiXinResponse;
    }
}
