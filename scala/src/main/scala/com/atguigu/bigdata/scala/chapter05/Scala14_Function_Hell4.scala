package com.atguigu.bigdata.scala.chapter05

object Scala14_Function_Hell4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱版
        // java -> method -> 压栈 -> 栈帧 - 弹栈
        // test
        // sum

        // 函数在使用外部变量时，如果外部变量失效时，会将这个变量包含到当前的函数内部
        // 形成闭合的使用效果。改变变量的生命周期
        // 将这种操作称之为closure (闭包)

        // 1. scala2.12版本中，反编译后，发现编译器重新声明了内部函数的参数，将使用外部变量作为内部函数的参数使用
        // 2. 早期Scala版本（2.11），闭包会被编译为匿名函数类，如果使用外部变量，会将外部变量作为类的属性。
        //    早期Scala版本（2.11）,即使没有使用外部的变量，也会有闭包的效果，只是没有包含外部变量。
        // 3. Spark如何判断闭包：判断类名中是否为匿名函数类.

        // 4. 匿名函数肯定为闭包，将函数赋值给变量使用也是闭包，嵌套的内部函数在外部使用会有闭包
//        def test( i:Int ) = {
//            def sum( j:Int ) = {
//                i + j
//            }
//            sum _
//        }

        def test( ) = {
            def sum( j:Int ) = {
                j
            }
            sum _
        }

        println(test()(20))
    }

}
