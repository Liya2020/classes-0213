package com.atguigu.bigdata.scala.chapter06

object Scala23_Method_Instance5 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 构造方法

        // 先构造父类，再构造子类
        val user = new User("wangwu")
        // AAAA
        // CCCC
        // DDDD

    }
    class Person(name:String) {
        println("AAAA")
        def this() = {
            this("zhangsan")
            println("BBBB")
        }
    }
    class User() extends Person("zhangsan"){
        println("CCCC")
        def this(name:String) = {
            this()
            println("DDDD")
        }
    }


}


