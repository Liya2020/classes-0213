package com.atguigu.bigdata.scala.chapter08

object Scala06_Match5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 模式匹配 - 应用
        val Array(first, second, _*) = Array(1, 7, 2, 9)

        val Person(name, age) = Person("zhangsan", 16)
        println(name)

        val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
        for ( kv <- map ) {
            //println(kv._1 + "," + kv._2)
        }

        // 模式匹配还可以过滤数据
        for ( ( k, 0 ) <- map ) {
            println(k)
        }

    }
    case class Person(name: String, age: Int)
}
