package com.atguigu.bigdata.scala.chapter12

import scala.util.matching.Regex

object Scala01_Regex {

    def main(args: Array[String]): Unit = {

        // TODO 正则表达式
        // 类似于模式匹配
        // 模式匹配是对数据进行匹配
        // 正则表达式对字符串的内容进行匹配
        // 有自己的匹配规则
        
        // 声明规则
        val r: Regex = "^s".r
        val r1: Regex = "s$".r

        // 使用规则
        val s = "shello scalas"
        val maybeString: Option[String] = r1.findFirstIn(s)
       // r.findAllMatchIn()
       // r.findAllIn()
        if ( maybeString.isEmpty ) {
            println("没有符合规则的内容")
        } else {
            println(maybeString.get)
        }

        // TODO 判断字符串是不是一个电话号码
        // 1. 全部都是数字
        // 2. 数字长度是11位
        val r2: Regex = "^\\d{11}$".r
        val s1 = "02345678901"
        val maybeString1: Option[String] = r2.findFirstIn(s1)
        if ( maybeString1.isEmpty ) {
            println("没有符合规则的内容")
        } else {
            println(maybeString1.get)
        }

    }
}
