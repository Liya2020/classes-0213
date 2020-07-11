package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks._

object Scala14_Loop9 {

    def main(args: Array[String]): Unit = {

        // Scala 循环 - 中断

        // breakable 是一个方法，{}其实是参数列表
        // TODO 将一段代码作为参数传给一个方法

        breakable{
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    // 中断循环
                    break
                }
                println("i = " + i)
            }
        }

        println("yyyyyyy")

    }
}
