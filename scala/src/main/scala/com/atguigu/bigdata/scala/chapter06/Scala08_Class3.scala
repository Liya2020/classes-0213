package com.atguigu.bigdata.scala.chapter06

object Scala08_Class3 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - Class
        // TODO Scala中class可以继承（extends）父类
        // 多态 ： 一个对象在不同场合下所表示的不同的状态。

        // Scala当省略类型，编译器会自动将构建对象的类型进行推断。
        //val user = new User08()
        // 如果需要使用多态操作，那么必须显示声明类型
        val user:Parent08 = new User08()
        println(user)

    }
}
// 父类
class Parent08 {

}
// 子类
class User08 extends Parent08 {

}
