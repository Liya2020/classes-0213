package com.atguigu.bigdata.scala.chapter08

object Scala09_Match8 {

    def main(args: Array[String]): Unit = {

        val list = List(
            ("a", 1),
            ("b", 2),
            ("c", 3)
        )

        val newlist = list.map(
            t => {
                (t._1, t._2 * 2)
            }
        )

        list.map {
            case (word, count) => {
                (word, count * 2)
            }
        }


        println(newlist)

    }
}
