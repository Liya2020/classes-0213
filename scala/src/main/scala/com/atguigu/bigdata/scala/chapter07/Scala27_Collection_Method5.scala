package com.atguigu.bigdata.scala.chapter07

object Scala27_Collection_Method5 {

    def main(args: Array[String]): Unit = {

        val list = List((1,2),(2,3))

        // sortWith : 用于判断左边数据是否小于右边数据，
        //            如果满足（true），升序，不满足（false）就是降序
        // TODO 实现时，只需要考虑满足我们自定义条件的场合下，返回true就可以。
        val sortList =
            list.sortWith(
                ( left, right ) => {
                    if ( left._1 < right._1 ) {
                        true
                    } else if ( left._1 == right._1 ) {
                        left._2 > right._2
                    } else {
                        false
                    }
                }
            )

        println(sortList)
    }

}
