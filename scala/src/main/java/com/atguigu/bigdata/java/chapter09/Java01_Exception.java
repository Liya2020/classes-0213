package com.atguigu.bigdata.java.chapter09;

import java.util.List;

public class Java01_Exception {
    public static void main(String[] args) {

        //User user = null;
        //System.out.println(user);
        // TODO 空指针异常: 调用一个为空（null）对象的成员方法或成员属性就会发生空指针异常。
        // JVM执行程序是发生的错误，不是源码中的错误，是字节码运行的错误。
        // Array[Int] => int[]
        //System.out.println(user.age);

        // age(Integer) => test => age(int)
        // 拆箱操作可能会导致空指针异常。
        // 拆箱 ： Integer.intValue(member)
        //test(user.age);

        // 装箱：Integer.valueOf(static)
        //Integer id1 = 200;
        //Integer id2 = 200;

        // 包装类型的数据比较，一般用equlas方法

       // System.out.println(id1 == id2);

        List list = null;

        // list.iterator() (member)
        // 所有可迭代的对象都可以使用增强for循环
        for ( Object obj : list ) {
            System.out.println(obj);
        }
    }
    public static void test( int age ) {
        System.out.println( "年龄 = " + age );
    }
}
class User {
    public static Integer age;
    public static Integer id;
}
