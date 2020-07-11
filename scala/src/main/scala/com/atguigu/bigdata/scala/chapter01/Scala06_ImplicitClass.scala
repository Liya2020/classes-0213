package com.atguigu.bigdata.scala.chapter01

import com.atguigu.bigdata.scala.chapter10.Scala06_Transform5.User

object Scala06_ImplicitClass {
    implicit class UserExt05(user : User) {
        def updateUser(): Unit = {
            println("update 05 user...")
        }
    }
}
