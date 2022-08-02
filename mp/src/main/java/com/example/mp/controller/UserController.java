package com.example.mp.controller;

import com.example.mp.commons.Result;
import com.example.mp.entity.User;
import com.example.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Name: UserController.java
 * @Package: com.example.mp.controller
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 10:46
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id) {
        return new Result(true, 200, "查询成功", userService.findById(id));
    }

    @PostMapping
    public Result insert(@RequestBody User user) {
        return new Result(true, 200, "添加成功", userService.insert(user));
    }

    @PutMapping
    public Result update(@RequestBody User user) {
        return new Result(true, 200, "更新成功", userService.update(user));
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        return new Result(true, 200, "删除成功", userService.deleteById(id));
    }

}
