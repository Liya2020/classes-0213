package com.atguigu.bigdata.scala.chapter06

object Scala27_Abstract {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象编程 - 抽象
        // 抽象的对象一般理解为不完整的对象
        // 抽象类 ： 不完整的类
        // 抽象方法 ：不完整的方法
        //            只有声明而没有实现的方法
        //            无需使用abstract关键字修饰

        // TODO 如果一个类中有抽象方法，那么这个类一定抽象类
        //      抽象类应该使用abstract修饰。
        // TODO 如果一个类是抽象类，但是不见得一定有抽象方法。

        // 抽象类无法直接构造对象
        //new User27()
        // 如果想要抽象类构造对象，使用子类继承抽象类，构造子类的同时构造抽象类
        // 如果子类继承抽象类，必须将不完整的内容补充完整，否则依然是不完整的类，
        // 所以还是抽象类
        //new SubUser27
        println(new SubUser227())


    }
}
abstract class User27 {
    def test(): Unit
}
abstract class SubUser27 extends User27 {

}
class SubUser227 extends User27 {
    override def test(): Unit = {

    }
}

