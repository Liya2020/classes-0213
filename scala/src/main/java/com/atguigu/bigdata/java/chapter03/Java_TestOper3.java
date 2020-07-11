package com.atguigu.bigdata.java.chapter03;

public class Java_TestOper3 {
    public static void main(String[] args) {

        String s = null;
        System.out.println(isNotEmpty(s));
    }
    public static boolean isNotEmpty( String s ) {
        return s != null && !s.trim().equals("");
        // true && true
    }
}
