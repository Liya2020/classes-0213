package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks

object Scala13_Loop8 {

    def main(args: Array[String]): Unit = {

        // Scala 循环 - 中断
        //scala中没有break关键字
        // scala采用对象.方法的方式实现中断操作,使用抛出异常的方式来中断循环
        // scala将需要中断的循环放置在一个"代码块"中,可以处理异常
        Breaks.breakable{
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    // 中断循环
                    Breaks.break()
                }
                println("i = " + i)
            }
        }

        println("yyyyyyy")

    }
}
