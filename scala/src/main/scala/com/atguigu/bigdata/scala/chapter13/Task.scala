package com.atguigu.bigdata.scala.chapter13

class Task extends Serializable {

    var data : Int = 0
    var logic : Int => Int  = null

    def compute() = {
    logic(data)
}
}
