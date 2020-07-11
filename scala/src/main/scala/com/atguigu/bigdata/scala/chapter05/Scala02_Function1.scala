package com.atguigu.bigdata.scala.chapter05

object Scala02_Function1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程
        // 函数 & 方法
        // 方法概念来自于java
        // 函数概念来自于scala
        // Scala也是完全函数式编程语言。所以方法其实就是函数
        // 一般情况下，将类中封装的功能函数称之方法。
        // 其他地方封装的功能就称之为函数了。
        // 函数可以声明在任意地方，也可以嵌套声明使用
        // 类中的函数就是方法，符合java的语法规则：重写 & 重载
        // 函数是没有重写和重载的概念
        def test(): Unit = {
            println("xxxxx")
        }
//
//        def test(s:String): Unit = {
//            println("xxxxx")
//        }

        test()
        test()
        test()

    }

    def test1(): Unit = {
        println("test1...")
    }
    def test1(s:String): Unit = {
        println("test1...")
    }
}
