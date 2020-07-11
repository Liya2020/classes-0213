package com.atguigu.bigdata.scala.chapter07

object Scala22_Collection_WordCount2 {

    def main(args: Array[String]): Unit = {

        // (word, count)
        //val dataList = List("hello scala", "hello spark", "hive hadoop")

        // List( "hello", "hello", "hello", "hello", "hello spark" )
        // List( "hello hello hello hello" )

        val list = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        )

        // TODO 字符串可以重复出现
        // ("hello", 4) => "hello hello hello hello"
        val dataList: List[String] = list.map( kv => { (kv._1 + " ") * kv._2  } )

        // string => word
        // 完整的方法
//        val words: List[String] = dataList.flatMap(string=>{string.split(" ")})
//        val wordToWords: Map[String, List[String]] = words.groupBy(word=>word)
//        // List => size(count)
//        val wordToCount: Map[String, Int] = wordToWords.map( kv => { ( kv._1, kv._2.size ) } )
//        // 函数柯里化可以省略参数列表
//        val result: List[(String, Int)] = wordToCount.toList.sortBy(kv=>kv._2)(Ordering.Int.reverse).take(3)


        // 简介的方法
        // 方法链
        val result = dataList
            .flatMap(_.split(" "))
            .groupBy(word=>word) // 不简化
            .map( kv => ( kv._1, kv._2.size ) ) // 不简化
            .toList
            .sortBy(_._2)(Ordering.Int.reverse)
            .take(3)

        println(result)

    }
}
