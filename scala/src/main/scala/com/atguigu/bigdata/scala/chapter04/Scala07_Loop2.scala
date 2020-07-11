package com.atguigu.bigdata.scala.chapter04

object Scala07_Loop2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 循环
//        for ( i <- Range(1,5) ) {
//            // i = 1 j = 1
//            // i = 1 j = 2
//            // i = 1 j = 3
        //    TODO Code...
//            for ( j <- Range(1,4) ) {
//                println("i = " + i + ",j = " + j )
//            }
//        }

        for( i <- Range(1,5);j <- Range(1,4) ) {
            //println("i = " + i + ",j = " + j )
        }

        for (i <- Range(1,5); j = i -1) {
            println("i = " + i + ",j = " + j )
        }

    }
}
