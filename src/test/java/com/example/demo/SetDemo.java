package com.example.demo;


import java.util.*;

/**
 * Created by xf on 2017/11/7.
 */
public class SetDemo {

    public static void main(String[] argus) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        Set<String> strSet = new HashSet<>();
        list.forEach(l ->strSet.add(l) );

        strSet.forEach(s -> System.out.println("打印出s:"+s));

        List<String> list2 = new ArrayList<>(strSet);
        list2.forEach(System.out::println);
        List<String> list3 = new ArrayList<>();
        list3.forEach(d -> System.out.println("打印出d:"+d));

        System.out.println("====================================:");

        int a =4;
        int b=5;
        int c=6;
        System.out.println(a>b?"EXPIRE":1);
        System.out.println(c>b?"EXPIRE":3);


    }

}
