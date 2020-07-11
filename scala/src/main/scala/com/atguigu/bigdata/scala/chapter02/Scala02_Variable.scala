package com.atguigu.bigdata.scala.chapter02

object Scala02_Variable {

    def main(args: Array[String]): Unit = {

        // Scala - 变量
        // 声明变量
        // 1. var 变量名称 : 变量类型 = 变量值
        var name : String = "zhangsan"
        // 如果可以通过语法推断出来变量类型，那么变量在声明时可以省略类型
        // Scala是静态类型语言，在编译时必须要确定类型的。
        // 2. var 变量名称 = 变量值
        var username = "lisi"

        println(name)
        println(username)

    }
}
