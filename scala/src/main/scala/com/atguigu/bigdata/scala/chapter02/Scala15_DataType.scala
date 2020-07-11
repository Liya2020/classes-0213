package com.atguigu.bigdata.scala.chapter02

import java.io.{FileWriter, PrintWriter}


object Scala15_DataType {

    def main(args: Array[String]): Unit = {

        // TODO 数据类型 - AnyVal

        val b : Byte = 10
        val s : Short = 10
        val i : Int = 10
        val l : Long = 10L
        val f : Float = 1.0f
        val d : Double = 1.0
        val ii = 20
        println(ii) // 如果省略类型，整数默认为Int类型
        val dd = 2.0
        println(dd) // 如果省略类型，浮点类型默认为Double类型

        val c : Char = 'B'
        val flg : Boolean = true

        // Unit 是一个类型，对象只有一个:()
        val u : Unit = test()
        println(u)
    }
    def test(): Unit = {

    }
}
