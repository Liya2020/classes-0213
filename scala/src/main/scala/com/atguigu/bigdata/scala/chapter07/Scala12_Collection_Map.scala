package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable


object Scala12_Collection_Map {

    def main(args: Array[String]): Unit = {

        // apply方法主要用于在伴生对象中构建对象

        // Scala - 集合 - Map - 映射
        // A=>B
        // K=>V
        // map集合用于存储kv对对象
        // 构建键值对对象
        // A -> B

        // 构建对象
        // map ：无序，key不能重复
        val map: Map[String, Int] =
           Map( "a" -> 1, "b" -> 2, "c" -> 3, "a" -> 4, "e" -> 5 )


        println(map)


    }
}
