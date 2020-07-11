package com.atguigu.bigdata.java.chapter01;

import java.io.Serializable;

public class User05 extends Person05 implements Serializable {
    public static void main(String[] args) {

    }
    public String name;

    public void test() {
        super.test();
        System.out.println(this.name + "," );
    }
}
class Person05 {
    public String name;
    public void test() {
    }
}