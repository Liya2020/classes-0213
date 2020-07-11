package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala09_Collection_Seq2 {

    def main(args: Array[String]): Unit = {

        // Scala - 集合 - Seq - 可变
        val buffer: ListBuffer[Int] = ListBuffer(1,2,3,4)

        // 增加数据
        buffer.append(5,6,7)
        buffer.insert(1,8)

        // 修改
        //buffer.update(1,9)
        //buffer(1) = 9

        // 删除数据
        //buffer.remove(1)
        buffer.remove(1,3)

        println(buffer)
        buffer.foreach(println)
        buffer.mkString(",")

    }
}
