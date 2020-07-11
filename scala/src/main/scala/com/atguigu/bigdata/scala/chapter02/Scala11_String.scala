package com.atguigu.bigdata.scala.chapter02

object Scala11_String {

    def main(args: Array[String]): Unit = {

        // TODO String 字符串
        // Scala中没有字符串类型，它的字符串来自于Java
        // String是不可变字符串，
        val name : String = "zhangsan"
        val age = 20
        //val str: String = name.substring(0,1)
        //println(str)

        // TODO 字符串拼接
        //val hello = "Hello " + name
        //println("name = " + name + ", age = " + age)

        // TODO 传值字符串
        //printf("name = %s, age = %s", name, age)

        // TODO 插值字符串
        //println(s"name = $name, age = $age")

        // JSON => JavaScript Object Notation
        // { "username":"zhangsan", "age":20 }
        // JSON 字符串：将对象转换为符合JSON格式的字符串
        // 相同类型的引号不能嵌套使用
        //val json = "{\"username\":\""+name+"\", \"age\":"+age+"}"
        //println(json)

        // TODO 多行字符串 """ ....."""
        // 竖线 表示顶格符
        val json =
            s"""
              | { "username":"$name", "age":$age }
            """.stripMargin
        println(json)

        val sql =
            s"""
              | select
              |    *
              | from user
              | where name = $name
            """.stripMargin

    }
}
