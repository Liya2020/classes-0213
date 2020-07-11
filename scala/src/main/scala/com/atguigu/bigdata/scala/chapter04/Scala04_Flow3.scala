package com.atguigu.bigdata.scala.chapter04

object Scala04_Flow3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 没有三元运算符
        // 使用if else 来代替

        // 如果大括号中代码逻辑只有一行，那么可以省略的

        //val age = 20
//        val s : String  = if ( age < 20 ) {
//            "zhangsan"
//        } else {
//            "lisi"
//        }
        //val s = if ( age < 20 ) "zhangsan" else "lisi"

        // 如果一行代码中只有一段逻辑，那么可以省略分号。如果有多段逻辑，分号不能省略
        println("zhangsan")
        println("lisi")


    }
}
