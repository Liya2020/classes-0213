package com.atguigu.bigdata.java.chapter05;

public class Java_Method {
    public static void main(String[] args) {
        regUser("zhangsan", null);
    }

    public static void regUser( String name, String password ) {
        if ( password == null ) {
            password = "000000";
        }
    }
}
