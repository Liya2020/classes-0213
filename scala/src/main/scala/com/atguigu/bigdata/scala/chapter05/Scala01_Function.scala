package com.atguigu.bigdata.scala.chapter05

object Scala01_Function {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程
        // 函数声明方式
        // def 函数名 （参数列表）: 返回值类型 = { 函数体 }

        // 函数调用
        // 函数名（参数）
        test("zhangsan")

    }
    // 参数声明规则 => 参数名：参数类型
    def test( s : String ): Unit = {
        // 逻辑代码
        println("s = " + s)
    }
}
