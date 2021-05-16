package com.mtit.user.controller;

import com.mtit.user.VO.ResponseTemplateVO;
import com.mtit.user.entity.User;
import com.mtit.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithProduct(@PathVariable("id") Long userId){
        log.info("Inside getUserWithProduct of UserController");
        return userService.getUserWithProduct(userId);
    }

}
