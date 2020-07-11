package com.atguigu.bigdata

import com.atguigu.bigdata.scala.chapter06.Scala14_Field5_Access.User

object TestPackageAccess {

    def main(args: Array[String]): Unit = {

        var user = new User()
        user.sex
        //user.age
        user.email

    }
}
class TestUser extends User {
    def testSub(): Unit = {
        println(this.tel)
        //println(this.name)
        //println(this.age)
        //this.email
    }
}
