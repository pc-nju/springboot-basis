package com.tushuo.controller;

import com.tushuo.entity.User;
import com.tushuo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 咸鱼
 * @date 2018/12/13 22:39
 */

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api("测试 UserController 相关api")
public class UserController {

    private final UserService userService;

    @ApiOperation(value = "保存用户", notes = "保存用户")
    @ApiImplicitParam(name = "user", value = "User", required = true, dataType = "User")
    @PostMapping("/user")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }
}
