package com.springBoot.controllers;

import com.alibaba.fastjson.JSON;
import com.example.demo.api.ZhiXinAPI;
import com.example.demo.io.ZhiXinRequest;
import com.example.demo.io.ZhiXinResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ZhiXinController {
    @RequestMapping("daily")
    public String getWeatherDaily(String location, String days) throws IOException {

        ZhiXinRequest zhiXinRequest = new ZhiXinRequest();
        // 要查询的城市
        zhiXinRequest.setLocation(location);
        // 要查询的天数
        zhiXinRequest.setDays(days);
        // 要访问的接口
        String method = "/weather/daily.json";
        zhiXinRequest.setMethod(method);
        ZhiXinAPI zhiXinAPI = new ZhiXinAPI();
        // 发送并接收返回的信息
        ZhiXinResponse zhiXinResponse = zhiXinAPI.sendRequest(zhiXinRequest);
        // 将信息转换成json
        String result = JSON.toJSONString(zhiXinResponse);
        return result;
    }
}
