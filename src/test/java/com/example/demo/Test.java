package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xf on 2017/10/26.
 */
public class Test {


    public static void main(String[] argus) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        System.out.println(Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        list.add("e2r");
        list.add("few");
        String s = JSON.toJSONString(list);
        System.out.println("s:"+s);
    }

}
