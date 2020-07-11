package com.atguigu.bigdata.scala.chapter02

object Scala03_Variable1 {

    def main(args: Array[String]): Unit = {

        // TODO final不能直接修饰变量
        // TODO scala为了让变量声明后不能发生修改，并且不能使用final关键字的场合
        //      产生了新的关键字（val）声明变量，声明后的变量无法修改
        val name : String = "zhangsan"

        //name = "lisi"
        //name = "wangwu"
        // TODO val比var使用的场景更多，更广
        val lisi = "lisi"


    }
}
