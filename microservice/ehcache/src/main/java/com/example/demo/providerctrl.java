package com.example.demo;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot/demo")
public class providerctrl {
@Autowired
    private UserService UserService;
    @ResponseBody
    @RequestMapping("/name")
    public String name(){
        System.out.println();
        return "hello world1";
    }
    @ResponseBody
    @RequestMapping("/testRepository")
    public String testRepository(){
        UserService.addUser();
        return "testRepository succ";
    }

    public static void main(String[] args) {
        System.out.println("222222222222");
    }
}
