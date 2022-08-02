package com.example.mp.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Name: SexEnum.java
 * @Package: com.example.mp.enums
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 9:45
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SexEnum implements IEnum<Integer> {

    NONE(0, "保密"),

    MAN(1, "男"),

    WOMAN(2, "女");

    private Integer code;

    private String name;

    SexEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getValue() {
        return code;
    }

    public String getName() {
        return name;
    }
}
