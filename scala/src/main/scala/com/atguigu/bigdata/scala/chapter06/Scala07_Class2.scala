package com.atguigu.bigdata.scala.chapter06

object Scala07_Class2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - Class

        // TODO Thread sleep, wait方法的区别？
        // object一般就是用于声明静态方法，通过类名直接访问。
        // 如果需要通过对象访问属性或方法，那么就使用class声明
        // 如果需要通过类名就可以直接访问属性或方法，那么就使用object声明

        // TODO 构建对象
        // 使用class来声明，那么需要使用new的方式
        // new对象时，由于构造方法无参的原因，小括号可以省略
        val user1 : User077 = new User077()
        val user3 : User077 = new User077
        println(user1)
        println(user3)

        // 使用object来声明，那么可以直接使用类名,但是获取的是伴生对象
        // 不能使用new
        val user2 = User07
        println(user2)

        // TODO 调用方法
        // 使用class声明的类无法通过类名直接访问方法或属性，必须构建对象
        //user1.test1()
        // 使用object声明的类可以通过类名直接访问属性或方法。
        //User07.test2()

    }
}
class User077 {
   def test1(): Unit = {
       println("user....")
   }
}
object User07 {
    def test2(): Unit = {
        println("object....")
    }
}

