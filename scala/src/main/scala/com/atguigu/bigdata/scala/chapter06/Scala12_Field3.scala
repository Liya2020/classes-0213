package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala12_Field3 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 属性
        // spring => 自动装配 => 自动完成两个对象关系的组合(User, Dept)

    }
    // 内部类
    class User {
        var name : String = _
        def setName(name:String): Unit = {
            this.name = name
        }
        def getName(): String = {
            return this.name
        }

    }
}

