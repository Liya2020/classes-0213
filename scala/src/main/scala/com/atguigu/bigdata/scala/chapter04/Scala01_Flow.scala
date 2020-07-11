package com.atguigu.bigdata.scala.chapter04

object Scala01_Flow {

    def main(args: Array[String]): Unit = {

        // Scala - 分支
        // 单分支
        val age = 70
        if ( age < 30 ) {
            //println("age < 30")
        }

        //println("age.....")

        // 双分支
        if ( age < 20 ) {
            //println("age < 20")
        } else {
            //println("age >= 20")
        }

        // 多分支
        if ( age < 18 ) {
            println("少年")
        } else if ( age < 36 ) {
            println("青年")
        } else if ( age < 55 ) {
            println("中年")
        } else {
            println("老年")
        }

    }
}
