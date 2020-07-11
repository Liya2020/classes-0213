package com.atguigu.bigdata.scala.chapter09;

public class Java03_Exception2 {
    public static void main(String[] args) throws Exception{

        // Java在调用scala对象时，并没有明确的处理异常
        // 如果想要在处理时，明确异常的处理，那么需要在scala对象的方法前增加注解
        // @throws[异常类型]
        Dept03 dept = new Dept03();
        dept.test();

    }
}
