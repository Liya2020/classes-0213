package com.atguigu.bigdata.java.chapter06;

public class Java05_Access {
    public static void main(String[] args) throws Exception {

        User05 user = new User05();
        User05 user1 = new User05();
        User05 user2 = new User05();
        User05 user3 = new User05();
        // Object 提供的方法： private, public , protected
        // 访问权限：权利和限制
        // protected : 同类，同包，子类
        // 方法的提供者：java.lang.Object
        // 方法的调用者：com.atguigu.bigdata.java.chapter06.Java05_Access
        // 问题1：方法的调用者不是User05？
        //       com.atguigu.bigdata.java.chapter06.Java05_Access
        // 问题2：点的作用？
        //        从属关系
        // 问题3 ： Java05_Access和Object没有父子关系？
        //
        //user.clone();

        // 给user对象的name属性赋了一个值为zhangsan
        //user.name = "zhangsan";

    }
}
// 声明一个类，默认会继承Object类，同时会继承Object 中的方法
class User05 {

    public String name;
}
