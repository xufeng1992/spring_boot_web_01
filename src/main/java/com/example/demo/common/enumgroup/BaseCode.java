package com.example.demo.common.enumgroup;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * Created by xf on 2017/11/21.
 */
public enum BaseCode {

    SUCCESS(200,"成功");

    private int code;
    private String message;

    BaseCode(int code,String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
