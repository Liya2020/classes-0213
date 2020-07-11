package com.atguigu.bigdata.scala.chapter06

object Scala37_Interface6 {
    def main(args: Array[String]): Unit = {

        // Scala - 特质 - 功能执行顺序

        // 1. 类混入多个特质的时候，功能的执行顺序从右向左
        // 2. 特质中的super其实有特殊的含义，表示的不是父特质，而是上级特质。
        // 3. 如果想要改变执行顺序，需要指定特质的类型
        // 向日志中向数据库中操作数据
        new MySQL37().operData()

    }
}
trait Operate37 {
    def operData(): Unit = {
        println("操作数据")
    }
}
trait DB37 extends Operate37 {
    override def operData(): Unit = {
        print("向数据库中")
        super.operData()
    }
}
trait Log37 extends Operate37 {
    override def operData(): Unit = {
        print("向日志中")
        //super[Operate37].operData()
        super.operData()
    }
}

class MySQL37 extends DB37 with Log37 {

}
