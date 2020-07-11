package com.atguigu.bigdata.scala.chapter09

object Scala02_Exception1 {

    def main(args: Array[String]): Unit = {


    }
}
class Dept03 {
    @throws[Exception]
    def test() = {
        throw new Exception
    }
}
