package com.atguigu.bigdata.scala.chapter03

object Scala04_Operator4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala是一个完全面向对象的语言
        // 万物皆对象
        // 数字其实是数值类型的对象
        val i = 1.+(1)
        val j = 2.-(2)
        println(i)

        // 字符串：
        val str: String = "abc".*(2)
        println(str)
    }
}
