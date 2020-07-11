package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.scala.chapter10.Scala06_Transform5.User

object Scala06_Transform5 extends Test{

    def main(args: Array[String]): Unit = {

        // TODO 隐式转换的查找规则

        // 隐式类不能放置在顶级（top-level）对象中
        // 1. 当前代码的作用域中找到即可
        // 2. 当前代码上级作用域
        // 3. 当前类所在的包对象
        // 4. 当前类的父类或特质
        // 如果想要隐式转换，那么直接导入
        import com.atguigu.bigdata.scala.chapter01.Scala06_ImplicitClass._
        val user = new User()
        user.updateUser()
        user.insertUser()

    }
//    implicit class UserExt07(user : User) {
//        def updateUser(): Unit = {
//            println("update 07 user...")
//        }
//    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
    }
}
trait Test {
//    implicit class UserExt06(user : User) {
//        def updateUser(): Unit = {
//            println("update 06 user...")
//        }
//    }
}
