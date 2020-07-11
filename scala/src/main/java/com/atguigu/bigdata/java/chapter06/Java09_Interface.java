package com.atguigu.bigdata.java.chapter06;

public class Java09_Interface {
    public static void main(String[] args) {

        Test09 test = new User09();
        System.out.println(test);

        System.out.println(User09.class.getInterfaces().length);

        // User09并没有实现Test09接口
        //Test09 test1 = new Person09();
        //Person09 person = new User09();
        // 多态的传递

    }
}
interface Test09 {

}
class Person09 implements Test09 {

}
class User09 extends Person09 {

}
