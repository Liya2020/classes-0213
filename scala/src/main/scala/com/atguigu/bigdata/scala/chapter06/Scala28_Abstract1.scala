package com.atguigu.bigdata.scala.chapter06

object Scala28_Abstract1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 抽象

        // 抽象类中可以有完整的方法。
        // 如果抽象类中没有不完整的方法，那么子类就无需声明为抽象的，可以直接构建对象
        //println(new SubUser28())

        // TODO 如果子类重写父类的完整方法，需要显示增加override关键字来修饰
        // TODO 如果子类重写父类的抽象方法，需要直接补充完整即可, 或采用override关键字修饰

        println(new SubUser28())


    }
}
abstract class User28 {
    def test(): Unit = {

    }
}
class SubUser28 extends User28 {
    override def test(): Unit = {

    }
}
