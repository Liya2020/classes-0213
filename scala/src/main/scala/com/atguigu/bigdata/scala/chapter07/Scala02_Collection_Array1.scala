package com.atguigu.bigdata.scala.chapter07

object Scala02_Collection_Array1 {

    def main(args: Array[String]): Unit = {
        
        // Scala - 集合 - 数组
        // 可变集合，不可变集合
        // TODO Array不可变数组集合
        // 对不可变集合的数据操作会产生新的数组
        // 采用其他的方式创建数组
        // apply方法
        val array = Array(1,2,3,4)

        // 添加数据
        // 使用 :+ 5 表示向数组的后面添加数据
        val newArray: Array[Int] = array :+ 5

        val newArray2: Array[Any] = array :+ "5"

        println(array.mkString(", "))
        println(newArray.mkString(", "))

        // 使用 +: 表示向数组的前面添加数据
        //val newArray1: Array[Int] = array.+:(5)
        // 如果集合的方法采用冒号结尾，那么运算规则从右向左执行
        val newArray1: Array[Int] = 5 +: array

        // ++ 运算符表示增加集合数据（多个数据）
        //array ++ newArray1
        //array +: 5
        println(newArray1.mkString(", "))
        println(newArray2.mkString(", "))

        val ints = List(1,2,3,4)
        ints.map(_*2)
    }
}
