package com.atguigu.bigdata.scala.chapter04

object Scala06_Loop1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 循环
        // 循环守卫： 条件
        for ( i <- Range(1,5) if i != 3  ) {
            println("i = " + i )
        }

//        for ( i <- Range(1,5)  ) {
//            if (i != 3) {
//                println("i = " + i )
//            }
//        }

    }
}
