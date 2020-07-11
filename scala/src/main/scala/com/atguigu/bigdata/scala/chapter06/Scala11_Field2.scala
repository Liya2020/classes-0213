package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala11_Field2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 属性


       // java Bean规范中，要求属性的set/get方法起名必须以set,get开头
        // private String name
        // public void setName(String name) { this.name = name }
        // public void getName() { return this.name }
        // 框架 会动态获取属性， 反射调用属性的get方法获取属性值。

        // Scala编译生成属性的set，get方法并没有遵循bean规范，这样在很多框架中无法使用。
        // 如果想要scala中的属性符合bean规范，可以采用特殊的注解：@BeanProperty
        val user = new User();
        user.setName("xxxx");
        println(user.getName());

    }
    // 内部类
    class User {

        // 属性
        @BeanProperty
        var name : String = _
        @BeanProperty
        var age : Int = _
        @BeanProperty
        val sex : String = "男"

    }
}

