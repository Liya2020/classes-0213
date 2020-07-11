package com.atguigu.bigdata.scala.chapter06

object Scala04_Import1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - import

        // Scala中可以采用import关键字导入对象
        // 导入对象只能对val声明的对象进行导入，var是不可以的。
        Predef.println("zhangsan")

        val user = new User04()

        import user._

        login()
        test4()


    }
}
class User04 {
    def test4(): Unit = {
        println("test4...")
    }

    def login(): Unit = {
        println("login...")
    }
}

