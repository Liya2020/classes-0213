package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱版

        // TODO 函数也是对象

        // TODO 1. 函数可以作为对象赋值给变量
        def test1() = {
            "zhangsan"
        }
        def test11(i:Int): Int = {
            i * 2
        }

        // 将函数赋值给变量，那么这个变量其实就是函数，可以调用
        // 函数如果没有参数列表，那么调用时可以省略小括号
        // 如果此时希望将函数不执行，而是当成一个整体赋值给变量，那么需要使用下划线

        // f1 => ()=>String
        //val f1 = test1 _

        // 如果不想使用下划线明确将函数作为整体使用，那么也可以直接声明变量的类型为函数
        // 函数类型 ： 参数列表 => 返回值类型
        val f1:()=>String = test1

        // 变量 ： 变量类型 = 变量值
        // s : String = "abc"

        // 变量 ： 函数类型 = 函数
        // f : ()=>String = test
        // 变量()

        val ff1 : (Int)=>Int = test11

        //println(f1())
        println(ff1(10))

        // TODO 2. 函数可以作为参数传递给其他的函数

        // TODO 3. 函数可以作为函数的返回值返回
    }

}
