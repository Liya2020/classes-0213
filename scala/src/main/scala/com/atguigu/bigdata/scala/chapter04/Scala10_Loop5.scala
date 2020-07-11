package com.atguigu.bigdata.scala.chapter04

object Scala10_Loop5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala
        // for循环的表达式的返回值就是Unit
        // 如果需要获取for循环表达式的具体值，使用yield关键字
        // 这种操作可以将一个集合转换为另外一个集合
        // 开发中不使用
        val result = for( i <- 1 to 5 ) yield {
            "*" * i
        }

        println("result = " + result)

    }
}
