package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala04_Collection_Array3 {

    def main(args: Array[String]): Unit = {
        
        // Scala - 集合 - 数组 - 可变
        // 类似于StringBuilder
        // 可变数组在mutable包中
        //val array = new ArrayBuffer[String]()
        val array = ArrayBuffer(1,2,3,4)

        // 数据的操作
        // 追加数据, 集合内部的元素发生改变。所以可变数组
        //array.append(5)
        //array.append(6)
        // 向指定的位置（索引）插入数据
        //array.insert(1, 7,8,9)

        // 对指定的位置（索引）修改数据
        //array(1) = 5 ==> 编译时，自动转换为update方法
        //array.update(1, 5)

        // 删除数据
        //array.remove(2)
        //array.remove(2,2)

        // 遍历数据
        println(array)
        //println(array.mkString(", "))
//        for ( s <- array ) {
//            println("s = " + s)
//        }

    }
}
