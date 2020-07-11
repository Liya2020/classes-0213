package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala05_Collection_Array4 {

    def main(args: Array[String]): Unit = {

        // Scala
        // 可变数组
        //    内部存储的数据可以动态操作，而不会产生新的集合
        //    可变数组提供了大量对数据操作的方法，基本上方法名都是单词
        // 不可变数组
        //    对数据的操作都会产生新的集合。
        //    提供对数据的操作方法相对来说，比较少，而且都是一些符号。

        // StringBuilder => String
        // 可变数组和不可变数组的互相转换。
        val array = Array(1,2,3)

        // 不可变 => 可变
        val buffer: mutable.Buffer[Int] = array.toBuffer

        val array1 = ArrayBuffer(1,2,3)

        // 可变 => 不可变
        val array2: Array[Int] = array1.toArray
    }
}
