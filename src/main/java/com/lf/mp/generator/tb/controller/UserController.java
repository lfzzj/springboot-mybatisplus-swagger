package com.lf.mp.generator.tb.controller;


import com.lf.mp.generator.tb.entity.User;
import com.lf.mp.generator.tb.service.IUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lf
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/tb/user")
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping(value = "/user/getall")
    public List<User> getUser(){
        return userService.list(null);
    }

    @DeleteMapping("{id}")
    public boolean removeId(@PathVariable String id){
        return userService.removeById(id);
    }

}
