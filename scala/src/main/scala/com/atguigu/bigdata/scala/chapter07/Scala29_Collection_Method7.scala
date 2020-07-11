package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala29_Collection_Method7 {

    def main(args: Array[String]): Unit = {

        // ("hello", 2)      => Map[ ("hello",2) ]
        // ("hello scala", 4)=> Map[("hello",4), ("scala", 4)]

        // TODO Scala - 集合 - 合并集合
        // Map( a->1, b->2, c->3 )
        // Map( a->4, d->5, c->6 )
        // =>
        // Map( a->5, b->2, d->5, c->9 )
        val map1 = mutable.Map( "a"->1, "b"->2, "c"->3 )
        val map2 = mutable.Map( "a"->4, "d"->5, "c"->6 )

        // map1.a => map2.a => map2.a（1+4）

        // reduce只能对集合内部的数据进行聚合操作
        val result: mutable.Map[String, Int] = map1.foldLeft(map2)(
            (map, kv) => {
                val k = kv._1
                val v = kv._2
                val newVal = map.getOrElse(k, 0) + v
                map(k) = newVal
                map
                //map.update(k,map.getOrElse(k, 0) + v )
                // map
            }
        )
        println(result)
    }

}
