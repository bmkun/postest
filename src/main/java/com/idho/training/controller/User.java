package com.idho.training.controller;

import com.idho.training.dto.UserDto;
import com.idho.training.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Idho
 */
@RestController
@RequestMapping("/api/postest")
@Slf4j
public class User {

    @Autowired
    UserService userService;

    @GetMapping("/getdata")
    public String showData() {
        return "anjay";
    }

    @PostMapping("/savedata")
    public String saveData(@RequestBody UserDto userDto) {
//        log.info("== DTO : {}", userDto);
        userService.simpan(userDto);
        return "input berhasil";
    }

}
