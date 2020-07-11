package com.atguigu.bigdata.scala.chapter06

import com.atguigu.bigdata.TestUser


object Scala24_QA {
    def main(args: Array[String]): Unit = {

        //
        val dept0 = Dept02() // object... apply
        dept0() // class...apply

    }
}
//class Dept02 {
//    private var name:String = "zhangsan"
//    private[bigdata] var age:String = "zhangsan"
//    protected var sex:String = "zhangsan"
//    var tel:String = "zhangsan"
//}
class Dept02 {
    def apply() = {
        println("apply... class...")
    }
}
object Dept02 {
    def apply(): Dept02 = {
        println("apply...object")
        new Dept02()
    }
}



