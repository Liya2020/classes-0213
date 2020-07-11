package com.atguigu.bigdata.scala.chapter07

object Scala25_Collection_Method3 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法 - 操作数据

        // TODO 对多个集合数据进行处理
//        val list1 = List(1,2,3,4)
//        val list2 = List(3,4,5,6,7)
//
//        // 并集，合集
//        // 1,2,3,4,3,4,5,6
//        println(list1.union(list2))
//        // 交集: 交叉的数据
//        // 3,4
//        println(list1.intersect(list2))
//        // 差集 : 当前集合减去交叉重合的数据
//        // 1,2
//        println(list1.diff(list2))
//        // 5,6
//        println(list2.diff(list1))

        // TODO 两个集合数据进行关联 ： 相同位置的关联
        // 如果两个集合的元素个数不相同，那么拉链后的数据取决于个数少的那个集合
        // TODO 拉链
//        val zipList: List[(Int, Int)] = list1.zip(list2)
//        println(zipList)
        // 自关联 : 数据和索引关联
        //val zipList1: List[(Int, Int)] = list1.zip(list1)
//        val list3 = List("a", "b", "c")
//        val zipList1: List[(String, Int)] = list3.zipWithIndex
//        //val zipList1: List[(Int, Int)] = list1.map( num=>(num, num) )
//        println(zipList1)

        // TODO 将数据的一部分作为整体来使用操作的函数
        val list = List(1,2,3,4,5,6,7,8)
        // 取得集合中每3条连续的数据的和
        // 滑动窗口 ： 数据指定的范围进行滑动
        //             可以将这个范围称之为窗口

        // 参数中的size表示窗口的数据长度
        // 参数中的step表示窗口滑动的幅度（步长）
        val iterator: Iterator[List[Int]] = list.sliding(3,3)
        while (iterator.hasNext) {
            println(iterator.next())
        }

    }

}
