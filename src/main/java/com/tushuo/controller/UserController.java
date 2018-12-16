package com.tushuo.controller;

import com.tushuo.entity.User;
import com.tushuo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 咸鱼
 * @date 2018/12/13 22:39
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }
}
