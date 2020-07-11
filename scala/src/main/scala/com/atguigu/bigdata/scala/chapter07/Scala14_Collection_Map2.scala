package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable


object Scala14_Collection_Map2 {

    def main(args: Array[String]): Unit = {

        // Scala - 集合 - Map - 映射 - 可变
        val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)

        // 获取指定key的value
        // java : map集合可以放null键null值
        //        map.get(key)
        // Option : 选项类型
        //          有值：Some，根据key可以获取值
        //          无值：None, 根据key获取不到值
        //          主要解决空指针问题
        val maybeInt: Option[Int] = map.get("a")
        println(maybeInt)
        // 从None对象中获取值会发生异常
        //println(maybeInt.get)
        // getOrElse方法表示获取数据，如果获取到，直接返回，如果获取不到，使用默认值
        println(maybeInt.getOrElse(-1))

        //maybeInt.isEmpty
        // Scala提供了更加简洁的方法
        val i: Int = map.getOrElse("a", -1)
        println(i)


    }
}
