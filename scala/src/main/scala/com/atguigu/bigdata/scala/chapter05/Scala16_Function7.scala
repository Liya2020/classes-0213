package com.atguigu.bigdata.scala.chapter05

object Scala16_Function7 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 柯里化
//        def test() = {
//            def fun(): Unit = {
//                println("xxxx")
//            }
//            fun _
//        }
//
//        test()()
        // 使用函数柯里化的方式声明函数
        // 所谓的柯里化，其实就是多个参数列表
        // 1. 简化嵌套函数开发
        // 2. 将复杂的参数逻辑简单化,可以支持更多的语法。
        def test1( i:Int, j:Int, f:(Int, Int)=>Int ): Unit = {

        }
        //test1(i,j )
        def test(i:Int)(j:Int)(f:(Int, Int)=>Int): Int = {
            //println("test...")
            f(i,j)
        }

        // 调用函数
        //println(test(1)(2)(_ + _))
        //test(10)

    }

}
