package com.atguigu.bigdata.scala.chapter01

/**
  *  Scala语言是一个完全面向对象的编程语言
  *  Java语言不是一个完全面向对象的编程语言
  *  object : scala语言中没有静态的语法,采用object方式模仿java中的静态语法
  *           通过类名访问方法。
  *  def : define缩写，表示声明方法的关键字
  *
  *  scala => args: Array[String] ： 参数声明 =>  参数名:参数类型
  *                                      => 名称 ： 类型
  *  农业文明 & 工业文明
  *  java => String[] args => 强类型语言 => 类型 名称
  *
  *  Array : scala中的数组， 类似于java中的中括号
  *  [String] : 表示泛型
  *
  *  scala => main ：Unit => 方法名：类型
  *  java  => void main => 类型 方法名
  *
  *  Unit(类型) <==> void（关键字）
  *
  *  = ： 赋值，方法也是对象，可以赋值
  *
  *  Scala语言是基于java语言开发的。所以可以直接嵌入java代码执行
  *
  *  Scala语言中默认会导入一些对象，那么这些对象的方法可以直接使用
  *  类似于java中import java.lang
  */
object Scala01_Hello {

    // public static void main(String[] args)
    def main(args: Array[String]): Unit = {
        // 方法体
        System.out.println("Hello Scala")

        // 打印
        println("Hello Scala")
    }
}
