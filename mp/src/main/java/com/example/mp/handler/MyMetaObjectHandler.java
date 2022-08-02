package com.example.mp.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Name: MyMetaObjectHandler.java
 * @Package: com.example.mp.handler
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 9:58
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "ctime", LocalDateTime.class, LocalDateTime.now());
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "utime", LocalDateTime.class, LocalDateTime.now());
    }
}
