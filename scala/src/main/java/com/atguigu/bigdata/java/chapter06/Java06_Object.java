package com.atguigu.bigdata.java.chapter06;

public class Java06_Object {
    public static void main(String[] args) {

        User06 user1 = new User06();
        User06 user2 = new User06();
//        user.test();
//        user.superTest();
        System.out.println(user1.hashCode());
        System.out.println(user1.superHashCode());

        System.out.println(user2.hashCode());
        System.out.println(user2.superHashCode());
    }
}
class Person06 {

    public void test() {
        System.out.println("person test...");
    }
}
class User06 extends Person06 {
    public void test() {
        System.out.println("user test...");
    }
    public void superTest() {
        super.test();
    }
    public int superHashCode() {
        return super.hashCode();
    }
}
