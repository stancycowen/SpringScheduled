package com.ly.train.traindemo.controller;

import com.ly.train.traindemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyc
 */
@RestController
@RequestMapping("/demo")
@ResponseBody
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(){
        return demoService.sayHello();
    }
}
