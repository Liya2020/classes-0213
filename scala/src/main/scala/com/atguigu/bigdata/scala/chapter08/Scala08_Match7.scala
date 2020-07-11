package com.atguigu.bigdata.scala.chapter08

object Scala08_Match7 {

    def main(args: Array[String]): Unit = {


        val list : List[Any] = List(1,2,3,4,5,6,"test")

//        list.map(
//            data => {
//                data + 1
//            }
//        )

        println(list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int] + 1))

    }
}
