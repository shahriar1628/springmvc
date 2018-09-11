package com.javacodegeeks.example.controller;

import com.javacodegeeks.example.config.RootConfig;

import com.javacodegeeks.example.bin.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        //ApplicationContext ctx;
       // ctx = new ApplicationContext(RootConfig.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
      Vehicle vh = (Vehicle) context.getBean("vehicle");
      System.out.println(vh.print());
        return "Hello World " + vh.print() ;
    }
}

