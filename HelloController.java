package com.aut.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @RequestMapping( "/index")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping("/testSession")
    public String test01(HttpSession session){
        session.setAttribute("try" ,"value");
        return "demo01";
    }

//向application域共享数据
    @RequestMapping("/testApplication")
    public String test02(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("try","value");
        return "demo02";

    }
}

