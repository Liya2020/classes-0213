package com.atguigu.bigdata.scala.chapter06

object Scala38_Object {
    def main(args: Array[String]): Unit = {
        println(Color.RED.id)
        println(Color.BLUE)

    }

}
object Color extends Enumeration {
    val RED = Value(1, "red")
    val YELLOW = Value(2, "yellow")
    val BLUE = Value(3, "blue")
}