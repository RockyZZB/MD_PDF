package com.md.controller;

/**
 * @author ：zb
 * @date ：Created in 2019/4/12 0012 9:10
 * @description：
 */

public class test {
    public static void main(String[] args) {
//        LocalDate.now().get
        String s = System.getProperty("user.dir");
        s=s.replaceAll("\\\\","\\/");
        System.out.println(s);
    }
}
