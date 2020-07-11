package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_Array2 {

    def main(args: Array[String]): Unit = {
        
        // Scala - 集合 - 数组 - 可变
        // 类似于StringBuilder
        // 可变数组在mutable包中
        val array = new ArrayBuffer[String]()

        // 数据的操作
        // 追加数据
        array.append("a")
        array.append("b")

        // 遍历数据
        println(array)
        println(array.mkString(", "))
//        for ( s <- array ) {
//            println("s = " + s)
//        }

    }
}
