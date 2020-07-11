package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala29_Abstract2 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 抽象

        // TODO 抽象属性
        // 所谓的抽象属性，其实就是属性不完整。
        //                 属性只有声明，而没有初始化
        // 如果一个类中存在抽象属性，那么这个类是抽象类
        // 抽象属性在编译时，不会产生类的属性，而是产生属性的set，get方法，并且方法为抽象的。
        // 重写抽象属性，那么等同于普通属性的声明：属性，set，get方法。

        // 通过子类继承抽象类，并将其中抽象属性补充完整，就可以构建对象
        println(new SubUser29())

        // TODO 子类重写父类的抽象属性，那么需要将属性补充完整即可
        // TODO 子类重写父类的完整属性，那么需要增加override关键字修饰
        // TODO 子类重复父类的属性时，这个属性不能是可变的(var)。需要采用val声明

        // 如果采用var声明的属性可以被重写，会产生歧义

        // Scala中类的属性在编译时，会自动生成私有属性和对应的set,get方法。

        println(new SubUser29().test())


    }
}
abstract class User29 {
    // 抽象属性
    var name : String
    // 完整属性
    @BeanProperty
    val age : Int = 20

    def test(): Unit = {
        //age = 40 // set
        println(age)// get
    }
}
class SubUser29 extends User29 {
    // 将抽象属性补充完整
    var name : String = "zhangsan"
    @BeanProperty
    override val age : Int = 30
}

