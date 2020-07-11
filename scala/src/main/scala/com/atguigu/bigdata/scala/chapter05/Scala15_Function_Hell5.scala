package com.atguigu.bigdata.scala.chapter05

object Scala15_Function_Hell5 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱版

        // 1. 函数使用外部的变量
        // 当前场合不叫闭包
//        val a = 10
//
//        def test(): Unit = {
//            val b = a + 10
//            println(b)
//        }
//
//        val c = test _
//
//        c()
//        def test( f : (Int)=>Int ): Unit = {
//            println(f(10))
//        }
//
//        test( (i:Int)=>{i*2} )

        def test( ) = {
            def sum(  ) = {
                println("inner sum...")
            }
            sum()
            //sum _
        }

        test()
    }

}
