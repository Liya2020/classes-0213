package com.atguigu.bigdata.scala.chapter03

object Scala02_Operator2 {

    def main(args: Array[String]): Unit = {

        val user1 = null
        val user2 = new User()

        //println(user1 == user2)
        //println(user1.equals(user2))
        println(user1 eq user2 )
        // Scala中 eq一般用于比较对象的内存地址
        // 而 == 比较内容，类似于equals方法，并且进行了非空判断
    }
}
