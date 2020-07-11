package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala30_Collection_Method8 {

    def main(args: Array[String]): Unit = {

        val list = List(1,2,3,4)

        // fold方法直接获取最终的结果

        // scan类似于fold方法，但是会将中间的处理结果也保留下来
        // 集合扫描
        // 0, 1, 3, 6, 10
        //println("scan => " + list.scan(0)(_+_))
        // 集合扫描(左)
        //println("scanLeft => " + list.scanLeft(0)(_+_))
        // 集合扫描(右)
        println("scanRight => " + list.scanRight(0)(_+_))
    }

}
