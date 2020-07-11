package com.atguigu.bigdata.scala.chapter02

import java.util


object Scala17_DataType2 {

    def main(args: Array[String]): Unit = {

        // Unit(没有返回值)（void） => Nothing（无值）(exception)

        // TODO Null
        // Scala将null作为一个特殊的对象进行处理，类型就是Null
        val s = null
        val ss : String = null
        // AnyVal类型是不能使用null赋值的
        //val i : Int = null
        // TODO Nothing, 没有值
        // Nil 空集合
        //val nil: List[Nothing] = Nil

        // TODO Any ,AnyRef, AnyVal
        // Object => 引用类型的父类
        //        => 基本类型和Object无关
        // Any    => AnyRef
        //        => AnyVal
        //val a : Any = "123"
        //val r : AnyRef = "123"
        //val v : AnyVal = "123"
    }
    def test():String = {
        throw new Exception
    }
}
