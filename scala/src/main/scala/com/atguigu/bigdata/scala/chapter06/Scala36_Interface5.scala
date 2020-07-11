package com.atguigu.bigdata.scala.chapter06

object Scala36_Interface5 {
    def main(args: Array[String]): Unit = {

        // Scala - 特质 - 初始化顺序
        // 如果类混入多个特质，那么特质的初始化顺序为从左到右
        new User36();
    }
}
trait Test36 {
    println("aaaaa")
}
trait Test366 {
    println("bbbbb")
}
trait Test3666 {
    println("ccccc")
}
class User36 extends Test36 with Test366 with Test3666{
    println("ddddd")
}

