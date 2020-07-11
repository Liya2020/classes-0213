package com.atguigu.bigdata.scala.chapter02

import scala.io.StdIn


object Scala12_In {

    def main(args: Array[String]): Unit = {

        // TODO 输入
        // 从控制台获取输入转换为Int值
        val age: Int = StdIn.readInt()
        println("学生的年龄 = " + age)

    }
}
