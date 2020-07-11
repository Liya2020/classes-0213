package com.atguigu.bigdata.scala.chapter05

object Scala13_Function_Hell3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱版

        // 1. TODO 将函数作为返回值使用
        // 2 .将函数的执行结果返回
//        def test( i : Int ): Int = {
//            i * 2
//        }

//        def fun() = {
//            test _
//        }

        // 调用函数
        //val a = fun() // 当前fun函数的执行结果为函数，那么a此时就是函数
        //println(a(10))
        //println(fun()(10))
        //fun(10)
        // JS
        // a()()()()()()()()

        // TODO 当函数作为返回值使用时，一般会使用嵌套函数
        def fun() = {

            def test( i : Int ): Int = {
                i * 2
            }

            test _
        }

        // 如果 不想使用下划线返回返回对象那么需要显示声明函数的返回值类型
        def fun1():Int=>Int = {
            def test( i : Int ): Int = {
                i * 2
            }

            test
        }

        println(fun1()(10))
    }

}
