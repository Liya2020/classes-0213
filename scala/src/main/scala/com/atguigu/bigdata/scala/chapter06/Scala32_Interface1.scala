package com.atguigu.bigdata.scala.chapter06

object Scala32_Interface1 {
    def main(args: Array[String]): Unit = {

        // TODO Scala中没有接口的概念,也就没有interface关键字。
        // Scala可以将多个类中相同的特征从类里剥离出来，形成特殊的语法结构，称之为“特质”
        // 如果一个类，符合这个特征，那么就可以将这个特征（特质）混入到类中。

        // 特质中可以声明抽象方法
        val operate : Operate = new MySQL()
        operate.oper()

        // 特质可以看作interface
        // 类混入特质，就等同于实现interface
    }
}
// 声明特质
trait Operate {
    // 抽象方法 - 不完整方法
    def oper():Unit
}
// 如果一个类符合特质，那么可以将特质“混入”到类中, 采用extends关键字
// 类应该将特质中的抽象方法补全
class MySQL extends Operate {
    def oper():Unit = {
        println("执行mysql数据操作...")
    }
}

