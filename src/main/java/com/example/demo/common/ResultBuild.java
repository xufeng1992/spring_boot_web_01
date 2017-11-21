package com.example.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xf on 2017/10/26.
 */
public class ResultBuild {

    public static String buildSuccess(String message) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("message",message);
        return hashMap.toString();
    }

    public static String buildSuccess(Object data, String message) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("data",data);
        hashMap.put("code",200);
        hashMap.put("message",message);
        return hashMap.toString();
    }

    public static String buildSuccess(String code, String message,Object object) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("code",code);
        hashMap.put("message",message);
        hashMap.put("data",object);
        return hashMap.toString();
    }

    public static String buildError(String code, String message) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("code",code);
        hashMap.put("message",message);
        return hashMap.toString();
    }

}
