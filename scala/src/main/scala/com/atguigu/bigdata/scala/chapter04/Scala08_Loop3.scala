package com.atguigu.bigdata.scala.chapter04

object Scala08_Loop3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala
        // step 2
        // layer 9
        // 1,3,5,7,9,11,13,15,17
        val num = 9
//        for ( i <- 1 to 2*num by 2;  ) {
//            for ( j <- 1 to i ) {
//                print("*")
//            }
//            println("")
//        }

        for ( i <- 1 to 2*num by 2; j = (18-i)/2) {
            println( " " * j + "*" * i )
        }

    }
}
