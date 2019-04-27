package com.example.springboot04webrestfulcrud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
//        classpath:/templates/success.html
        return "success";
    }
//    访问首页，写一个index方法

    @RequestMapping({"/","/login"})
    public String index(){
        return "login";
    }



}