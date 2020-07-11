package com.atguigu.bigdata.scala.chapter06

object Scala26_Test1 {
    def main(args: Array[String]): Unit = {
        
        // 单例模式：
        // 1. 构造方法私有化
        // 2. 使用静态的方式获取指定类型对象
        val dept1 = Dept04()
        val dept2 = Dept04()

        println(dept1 eq dept2)

    }
}

class Dept04 private {
}
// 伴生对象只会初始化一次，所以是一个单例对象
// 让Dept04在伴生对象初始化时创建一次，不就是单例吗？
object Dept04 {
    val dept = new Dept04()
    def apply(): Dept04 = {
        dept
    }
}
