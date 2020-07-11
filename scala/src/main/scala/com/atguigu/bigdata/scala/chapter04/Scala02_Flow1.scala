package com.atguigu.bigdata.scala.chapter04

object Scala02_Flow1 {

    def main(args: Array[String]): Unit = {

        // Scala - 分支
        val age = 30
        // TODO Scala中表达式有返回值
        // 这个返回值取决于满足条件的最后一行代码的结果

        // 多分支
        val result = if ( age < 18 ) {
            "少年"
        } else if ( age < 36 ) {
            //println("青年")
            "青年"
        } else if ( age < 55 ) {
            "中年"
        } else {
            "老年"
        }

        // result => "青年"， 100， Unit
        // Unit => ()
        //resu
        println("结果 = " + result)

    }
}
