package com.springBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController  // 整合了@Controller和@ResponseBody这两个注解 用这个注解controller则controller中的方法无法返回jsp页面   配置的视图解析器不会起作用
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "nimade";
    }
}
