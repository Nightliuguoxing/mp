package com.example.mp.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.*;
import com.example.mp.enums.SexEnum;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Name: User.java
 * @Package: com.example.mp.entity
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 9:33
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
@Data
@ToString
@TableName(value = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 4804599208221594668L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    @TableField(value = "sex")
    private SexEnum sex;

    @TableField(value = "ctime", fill = FieldFill.INSERT)
    private LocalDateTime ctime;

    @TableField(value = "utime", fill = FieldFill.UPDATE)
    private LocalDateTime utime;

}
