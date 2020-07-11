package com.atguigu.bigdata.scala.chapter02

object Scala18_DataType3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 自动转换 - 隐式转换
        // Byte类型和Short类型之间没有任何的关系
        // 但是Scala通过隐式转换的规则将Byte类型自动变为Short类型
        val b : Byte = 10
        val s : Short = b
        val i : Int = s

        // 如果将精度大的类型转换为精度小的类型
        // java : 截取
        // scala : 方法转换
        val bb : Byte = i.toByte
    }
}
