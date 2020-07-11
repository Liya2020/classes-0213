package com.atguigu.bigdata.scala.chapter10

object Scala04_Transform3 {

    def main(args: Array[String]): Unit = {

        // OCP

        // 函数的参数预先知道可能会发生变化，为了遵循OCP开发原则
        // 可以给函数增加关键字implicit修饰一下
        // implicit修饰函数的参数时，这个参数所在的参数列表只能有一个参数

        // TODO 隐式参数
        def regUser( name:String)(implicit password:String ="123123" ): Unit = {
            println(s"注册用户：$name, 默认密码：$password")
        }

        // TODO 隐式变量
        implicit val pswd:String = "888888"

        // 如果使用隐式参数进行处理，那么调用函数时，不需要使用小括号调用
        // 如果使用小括号,隐式变量无法使用
        regUser("zhangsan")("666666")

        //
//        val list = List(1,3,4,2)
//        list.sortBy(num=>num)(Ordering.Int.reverse)
//        list.sortBy(num=>num)
        val s = "abc" // string => char[] => char(0)
        println(s(0))
        // StringOps 其实是字符串的一个辅助类，增加功能，靠隐式转换实现。
    }
}
