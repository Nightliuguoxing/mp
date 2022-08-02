package com.example.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Name: UserMapper.java
 * @Package: com.example.mp.mapper
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 9:41
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    public User findById(Integer id);

    public int insert(User user);

    public int update(User user);

    public int deleteById(Integer id);
}
