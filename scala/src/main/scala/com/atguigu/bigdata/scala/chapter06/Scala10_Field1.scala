package com.atguigu.bigdata.scala.chapter06

object Scala10_Field1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 属性
        // class可以声明在其他的地方
        // 1.+（1） => 1 + 1
        val user = new User()
        user.name = "wangwu"
        println(user.name)
        //user.name = "zhangsan"
        //user.name = "lisi"
        // java bean set, get
        //user.name.=("lisi")
        // user.name_=("zhangsan")
        //user.name_$eq("zhangsan")

        // TODO Scala类中声明的属性，不仅仅只有属性，还有其他的内容
        // 1. 编译时，类中声明的属性，其实都是private，
        //    private String name;
        // 并同时提供了公共方法进行访问。
        // 2. 编译生成的方法为：
        //    类似于java中bean对象的get方法，用于返回属性的值
        //    public String name() { return this.name }
        //    类似于java中bean对象的set方法, 用于设定属性的值
        //    public void name_$eq(final String x$1) {this.name = x$1;}
        // 3. 在使用时属性
        //    因为属性为私有的，所以给属性赋值，其实等同于调用属性的set方法
        //    因为属性为私有的，所以获取属性值，其实等同于调用属性的get方法

        // 4. 使用val声明的属性。
        //    在编译时，属性会被直接使用final修饰
        //    在使用的过程中，也不提供属性的set方法。



    }
    // 内部类
    class User {

        // 属性
        var name : String = _
        var age : Int = _
        val sex : String = "男"

    }
}

