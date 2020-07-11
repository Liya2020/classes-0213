package com.atguigu.bigdata.scala.chapter06

object Scala35_Interface4 {
    def main(args: Array[String]): Unit = {

        // Scala - 特质 - 初始化顺序

        // java中接口和父子类无关

        // 类，特质的初始化顺序
        // 1。 类如果有父类，而父类混入特质1，而特质1又继承特质2
        // 2.  那么特质2会先初始化
        // 3.  然后特质1在初始化。
        // 4.  接下来父类初始化
        // 5. 如果当前类还有特质的话，那么特质会先初始化
        // 6. 当前类初始化
        new SubUser35()

        // aaaaa
        // bbbbb
        // ddddd ==> parent class
        // ccccc ==> trait
        // eeeee ==> child class
    }
}
trait Parent35 {
    println("aaaaa")
}
trait Test35 extends Parent35 {
    println("bbbbb")
}
trait SubTest35 extends Parent35 {
    println("ccccc")
}
class User35 extends Test35 {
    println("ddddd")
}
class SubUser35 extends User35 with SubTest35{
    println("eeeee")
}

