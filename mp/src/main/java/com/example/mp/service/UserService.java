package com.example.mp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mp.entity.User;

/**
 * @Name: UserService.java
 * @Package: com.example.mp
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 9:40
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
public interface UserService extends IService<User> {

    public User findById(Integer id);

    public int insert(User user);

    public int update(User user);

    public int deleteById(Integer id);

}
