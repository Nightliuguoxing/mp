package com.example.mp.commons;

/**
 * @Name: Result.java
 * @Package: com.example.mp.commons
 * @Author LUCIFER-LGX
 * @Date 2022/8/2 10:48
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description:
 */
public class Result {

    private boolean flag;
    private Integer code;
    private String message;
    private Object data;

    public Result() {

    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
