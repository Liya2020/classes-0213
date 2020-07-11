package com.atguigu.bigdata.scala.chapter10

object Scala03_Transform2 {

    def main(args: Array[String]): Unit = {

        // 将User => Parent
        // 将函数声明前增加implicit关键字，可以由编译器自动识别和自动调用。
        // 完成类型的转换，并扩展功能。
        // 这种方法称之为隐式方法
        implicit def transform(user:User): Parent = {
            new Parent()
        }

        // TODO 1. 如果在当前的范围内，有多个相同的转换规则怎么办？
        //        转换无法成功，因为编译器无法识别用哪一个。
        //        相同的转换规则必须只能有一个。
        // TODO 2. 隐式转换方法调用的时机？
        //        二次编译：第一次编译会出现错误时，会选择隐式转换

        // 动态混入
        val user = new User() ;
        user.insertUser()
        user.updateUser()// 1. 编译出错， 2. 编译器查找转换规则。3 再次编译。

    }
    class Parent {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {

        def insertUser(): Unit = {
            println("insert user...")
        }
    }
}
