package com.aut.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
@RequestMapping("/")
    public String index() {
        return "index";
    }
    //ThymeleafView
    @RequestMapping("/demo01")
    public String test01(){
        return "demo";
    }
    //转发视图
    @RequestMapping("/forward")
    public String test02(){
    return "forward:demo01";
    }
}



