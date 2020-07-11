package com.atguigu.bigdata.scala.chapter07

object Scala23_Collection_WordCount3 {

    def main(args: Array[String]): Unit = {

        // word -> count
        // ("hello", 4)
        // ("hello", 3), ("spark", 3)
        // ("hello", 2), ("spark", 2), ("scala", 2)
        // ("hello", 1), ("spark", 1), ("scala", 1), ("hive", 1)
        val list = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        )

        // TODO 将数据进行扁平化操作
        val wordToCountList: List[(String, Int)] =
            list.flatMap(
                kv => {
                    // 将字符串进行分词
                    val str = kv._1
                    val count = kv._2
                    val words = str.split(" ")
                    // 将原有数据转换为新的数据格式
                    // word => (word, count)
                    words.map(
                        word => {
                            (word, count)
                        }
                    )
                }
            )
        // TODO 将相同的单词分在一个组中
        // hello => List（("hello", 4),("hello", 3),("hello", 2),("hello", 1)）
        val wordToListMap: Map[String, List[(String, Int)]] =
            wordToCountList.groupBy(_._1)

        // TODO 将数据进行结构的转换
        // hello => List（("hello", 4),("hello", 3),("hello", 2),("hello", 1)）
        // hello => List( 4, 3, 2, 1 )
        // hello => list.sum => 10
//        val wordToSumMap: Map[String, Int] = wordToListMap.map(
//            kv => {
//                val word = kv._1
//                val list = kv._2
//                val countlist: List[Int] = list.map(_._2)
//                val sum = countlist.sum
//                (word, sum)
//            }
//        )
        // TODO 在kv数据处理过程中，如果k保持不变，只对v进行处理，可以采用特殊的方法
        // mapValues
        val wordToSumMap: Map[String, Int] = wordToListMap.mapValues(
            v => {
                val ints: List[Int] = v.map(_._2)
                ints.sum
            }
        )

        val result =
            wordToSumMap
                .toList
                .sortBy(_._2)(Ordering.Int.reverse)
                .take(3)

        println(result)

    }
}
