package com.atguigu.bigdata.scala.chapter06

object Scala04_Import {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - import

        // 1. 导类，不是导包
        // 2. import static 静态导入,导入类的静态属性和静态方法
        // java语法中import操作功能比较单一。但是不能舍弃
        // Scala语言在java语法基础上进行扩展。

        // TODO 1. import 可以声明在任意的位置
        //import java.sql.Date
        //val date = new Date()

        // TODO 2. java中默认导入的类是java.lang包中的类
        //         scala中默认导入的类:
        //         2.1  java.lang包中所有的类
        //         2.2  scala包中的类
        //         2.3  Predef (类似于java中静态导入)
        //println("")

        // TODO 3. Scala中的import可以导包
        import java.sql
        //val date = new sql.Date();

        // TODO 4. 导入一个包中所有的类
        // scala中使用下划线代替java中的星号
        // import java.util.*;
        //import java.util._

        // TODO 5. 可以在一行中导入同一个包的多个类
//        import java.util.{ArrayList, HashMap}
//        new ArrayList()
//        new HashMap()

        // TODO 6. 使用import关键字将包中的类隐藏掉
        //import java.sql.{Date=>_, Array=>_,  _}

        // TODO 7. 使用import关键字将指定类起别名
        //import java.util.{Date=>UtilDate}
        //new UtilDate()
        // scala中没有字符串，直接使用java中的字符串
        //val s: String = "abc"
        //new ArrayList()
        //type UtilDate = java.util.Date
        //val a : UtilDate = new UtilDate()

        // TODO 8. Scala默认import是按照包的相对路径进行导入的。
        // 双亲委派机制 - 没起作用。
        // 如果不想使用相对路径，那么可以采用特殊的路径（root）访问

        //println(new _root_.java.util.HashMap())


    }
}
//package java {
//    package util {
//        class HashMap {
//            println("xxxxxxx")
//        }
//    }
//}

