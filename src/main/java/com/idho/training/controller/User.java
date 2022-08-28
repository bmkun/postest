package com.idho.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Idho
 */
@RestController
@RequestMapping("/api/postest")
public class User {

    @GetMapping("/getdata")
    public String show_data(){
        return "anjay";
    }
}
