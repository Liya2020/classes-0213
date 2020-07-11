package com.atguigu.bigdata.scala.chapter09

import java.io.FileInputStream

object Scala01_Exception {

    def main(args: Array[String]): Unit = {

        // TODO Scala中的异常和java的异常处理很相似
        // 1. catch关键字只使用一次
        // 2. 多个异常采用case语法进行区分
        // 3. 异常处理的语法类似于模式匹配，所以匹配方式从前到后
        //    一般会将范围大的异常放置在范围小的异常后面进行处理
        // 4. scala中的异常不分编译器异常和运行期异常。所以无需显示的处理和抛出
        //    scala中没有throws关键字

        try {
//            val i = 0
//            val j = 10 / i
            //val s:String = null
            //println(s.substring(1))
            //new FileInputStream("xxxx")
        } catch {
            case e:ArithmeticException => {
                println("ArithmeticException...")
            }
//            case e:Exception => {
//                e.printStackTrace()
//            }
        } finally {

        }

    }
}
