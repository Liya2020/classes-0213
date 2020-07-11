package com.atguigu.bigdata.scala.chapter01

object Scala02_Test {

    // 声明方法 def
    // 名称(参数列表) ： 类型
    // 参数名： 参数类型
    // 方法赋值
    def main( args : Array[String] ) : Unit = {
        // 方法体
        println("Hello Test")

        // 调用方法
        println(Scala02_Test.test())
    }

    def test() : String = {
        return "test"
    }
}
