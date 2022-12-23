package com.extension.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TsetController {

    @RequestMapping("/test/hello")
    public  String testHello(){
        return "success";
    }
}
