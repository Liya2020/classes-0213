package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable


object Scala11_Collection_Set1 {

    def main(args: Array[String]): Unit = {

        // Scala - 集合 - Set - 集
        // 可变集合
        //val set = mutable.Set(1,2,3,4,5,6,7,8)
        val set = mutable.Set(1,2,3,4)

        // 添加数据
        //set.add(3)
        // 产生新的集合
        val newSet: mutable.Set[Int] = set + 5
        // 不会产生新的集合
        val oldSet: mutable.Set[Int] = set += 5

        println( set eq newSet )
        println( set eq oldSet )

        // 修改集合
        // 向集合中添加数据
        //set.update(3,true)
        // 从集合中删除数据
        //set.update(2,false)

        // 删除数据
        //set.remove(3)
        set - 3
        set -= 3

        println(set)

    }
}
