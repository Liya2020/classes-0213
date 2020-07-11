package com.atguigu.bigdata.scala.chapter05

object Scala03_Function2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程

        // TODO 1. 无参，无返回值
        def fun1(): Unit = {
            println("fun1...")
        }

        //println(fun1())

        // TODO 2. 无参，有返回值
        def fun2(): String = {
            return "zhangsan"
        }

        //println(fun2())

        // TODO 3. 有参，无返回值
        def fun3(s:String): Unit = {
            println("name =" + s)
        }

       // fun3("zhangsan")

        // TODO 4. 有参，有返回值
        def fun4( name : String ): String = {
            return "name = " + name
        }

        //println(fun4("zhangsan"))

        // TODO 5. 多参，无返回值
        def fun5( name:String, age:Int ): Unit = {
            println(
                s"""
                  | {"username":"$name", "age":$age}
                """.stripMargin)
        }

        //fun5("zhangsan", 30)

        // TODO 6. 多参，有返回值
        def fun6( name:String, age:Int ): String = {
            return s"name = $name, age=$age"
        }

        println(fun6("zhangsan", 30))

    }

}
