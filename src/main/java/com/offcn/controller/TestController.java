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
        System.out.println("这是我的第一次修改代码---叶龙沙雕");
        System.out.println("222222222222222");
        System.out.println("666666666666666");
        System.out.println("777777777777777777777777777777");
        for (int i = 0; i <100 ; i++) {
            System.out.println("张正日是大沙雕！！！！！");
        }
        System.out.println("留连戏蝶时时舞，自在娇莺恰恰啼");
        session.setAttribute("msg","Hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        return (String)session.getAttribute("msg");
    }
}
