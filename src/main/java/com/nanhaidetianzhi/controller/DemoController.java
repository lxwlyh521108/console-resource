package com.nanhaidetianzhi.controller;

import com.nanhaidetianzhi.rabbitmq.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @Autowired
    private Sender sender;

    @RequestMapping("/")
    public  String hello() {
        for (int i=0;i<1000;i++){
            sender.send(i);
        }
          return "success";
    }
    @RequestMapping("docker")
    public  String docker() {
            sender.sendDocker();
        return "ok";
    }



}
