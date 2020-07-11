package com.atguigu.bigdata.scala.chapter02

object Scala06_Identifier {

    def main(args: Array[String]): Unit = {

        // TODO 标识符 （起名）
        // 默认情况下，scala标识符声明方式和java一致
        val name = "zhangsan"
        val na_me = "zhangsan"
        val na$me = "zhangsan"
        val name1 = "zhangsan"
        //val 4name = "zhangsan" // error
        val _name = "zhangsan"
        val $name = "zhangsan"
        //val class = "zhangsan" //error
        val Class = "zhangsan"

    }
}
