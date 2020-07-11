package com.atguigu.bigdata.java.chapter01;

public class HelloScala {
    public static void main(String[] args) {
        // 方法体
        System.out.println("Hello Scala");

        test();

        HelloScala.test();
    }

    public static void test() {
        System.out.println("test");
    }
}
