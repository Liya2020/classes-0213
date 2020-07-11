package com.atguigu.bigdata.scala.chapter05

object Scala20_Function11 {

    def main(args: Array[String]): Unit = {

        // TODO : Scala - 函数式编程 - 惰性(lazy)函数 - 延迟加载
        // lazy延迟加载功能是编译器在编译时产生大量的方法进行调用所实现的。
        // 用到数据的时候加载数据
        // 10000 JavaUser06
        def test(): String = {
            println("xxxxxxxxxx")
            "zhangsan"
        }

        lazy val name = test()
        println("********************") // 1 hour
        println("name = " + name)

        // TODO 将一个对象转换为另外一个类型的对象
        val a : Any = "abc"
        val b: String = a.asInstanceOf[String]

    }

}
