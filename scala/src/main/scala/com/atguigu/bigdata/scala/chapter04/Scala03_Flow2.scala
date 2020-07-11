package com.atguigu.bigdata.scala.chapter04

object Scala03_Flow2 {

    def main(args: Array[String]): Unit = {

        // Scala - 分支
        val age = 30

        val result = if ( age < 40 ) {
            20
        } else {
            //throw new Exception
            "abc"
        }
        // 满足 => 20 => Int
        // 不满足 => () => Unit

        println(result)

    }
}
