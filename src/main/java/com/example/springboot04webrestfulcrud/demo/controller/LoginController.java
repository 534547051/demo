package com.example.springboot04webrestfulcrud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author 汐月
 * @Date 2019-05-09 18:00
 */
@Controller
public class LoginController {

    //    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
//    @PostMapping(value = "user/login")
    @RequestMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {

        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            // 登陆成功，防止表单重复提交，可重定向到主页（这样才能加载模板引擎）
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        } else {
            //  登陆失败
            map.put("msg","用户名密码错误");
            return "login";

        }

    }
}