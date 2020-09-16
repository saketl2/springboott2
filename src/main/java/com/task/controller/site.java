package com.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class site {

    /*@RequestMapping("/public")
    public String home() {
        System.out.println("Home");

        return "/public/index";
    }*/

    @RequestMapping("/")
    public String index() {
        System.out.println("Home");

        return "index";
    } 

    @RequestMapping("site/page1")
    public String page1() {
        System.out.println("Page1");

        return "Page1";
    }


     @RequestMapping("site/page2")
    public String page2() {
        System.out.println("Page2");

        return "Page2";
    }
     @RequestMapping("site/page3")
    public String page3() {
        System.out.println("page3");

        return "Page3";
    }
     @RequestMapping("site/page4")
    public String page4() {
        System.out.println("page4");

        return "Page4";
    }

    

}