package com.atguigu.bigdata.scala.chapter10

object Scala07_Transform6 {

    def main(args: Array[String]): Unit = {
        def transform( implicit  d : Double ) = {
            d.toInt
        }
        implicit val dd : Double = 2.0

        // 含有隐式参数的方法，在调用时如果不使用小括号，那么表示使用隐式变量
        // 如果使用小括号，那么表示放弃使用隐式变量
        val result: Int = transform(3)
    }
}
