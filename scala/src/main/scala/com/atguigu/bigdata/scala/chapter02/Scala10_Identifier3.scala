package com.atguigu.bigdata.scala.chapter02

object Scala10_Identifier3 {

    def main(args: Array[String]): Unit = {

        //
        val `private` = "zhangsan"

        //println(`private`)

        val name = "zhangsan"

        println(s"name = " + name.substring(0,1))
        // EL
        println(s"name = ${name.substring(0,1)}")

    }
}
