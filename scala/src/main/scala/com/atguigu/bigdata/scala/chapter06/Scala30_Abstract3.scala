package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala30_Abstract3 {
    def main(args: Array[String]): Unit = {

        new SubUser30()

        // override 到底发生了什么事情？
        // 1  println(age)其实调用的子类的age的get方法
        // 2  println方法的位置 : 在父类初始化时进行调用。
        // 3  父类在初始化的时候，子类其实是没有初始化的。只有系统默认值0
    }
}
abstract class User30() {
//class User30 {
    val age : Int = 20
    println(age) //  age属性的get方法，成员方法，动态绑定技术
}
class SubUser30 extends User30 {
    override val age : Int = 30 // get方法
}

