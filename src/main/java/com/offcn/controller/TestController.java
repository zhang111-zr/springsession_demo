package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {
    @GetMapping("/set")
    public String setSession(HttpSession session){
        System.out.println("这是我的第一次修改代码---叶龙");
        System.out.println("这是我的第一次修改代码---zzr");
        System.out.println("这是我的第二次修改代码---叶龙");
        session.setAttribute("msg","Hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
