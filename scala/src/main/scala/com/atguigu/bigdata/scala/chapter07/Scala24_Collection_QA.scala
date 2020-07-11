package com.atguigu.bigdata.scala.chapter07

object Scala24_Collection_QA {

    def main(args: Array[String]): Unit = {

        //val list = List("hello", "hello")

        // 匿名函数的位置，下划线的作用
        // 1. 代替参数出现一次, 直接写下划线
        // 2. 下划线可以将函数作为整体进行传递
        // 3. 如果匿名函数的参数不参与逻辑处理，可以使用下划线省略

//        def groupFunction( s:String ): String = {
//            s
//        }

        //list.flatMap(list=>list)

        // TODO 如果匿名函数中逻辑处理直接返回参数本身，那么不要使用下划线省略参数
//        val stringToStrings =
//            list.groupBy(x=>x)
//        println(stringToStrings)

        //list.foreach( println )
//        val dataList = List(
//            List(1,2), List(3,4)
//        )
//
//        println(dataList.flatMap(list => list))

//        val list: List[Any] = List( 1,2, List(3,4) )
//        list.flatMap(
//            data => {
//                // 模式匹配
//                if ( data.isInstanceOf[List] ) {
//                    data.asInstanceOf[List]
//                } else {
//                    List(data)
//                }
//            }
//        )

        // TODO 排序 : sortBy
        val ints = List(1,4,3,2)
        val ints1 = List("1", "11", "2")
        val ints2 = List((30,"zhangsan"), (20,"wangwu"), (20, "lisi"))

        //println(ints.sortBy(num => num)(Ordering.Int.reverse))
        //println(ints1.sortBy(s => s)(Ordering.String.reverse))
        //println(ints2.sortBy(t => t)(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String)))

        // TODO : 自定义排序
        // 两两比较大小
        // 大 > 小 => 降序
        // 小 < 大 => 升序

        // sortWith 默认的比较规则就是小于：升序
        // lt => less than => true

        // 升序：true, 降序，false
        println(ints2.sortWith(
            (left, right) => {

                // 升序
                // TODO 当满足你的排序要求时，你就返回true
                // TODO 当不满足你的排序要求时，你就返回false

                //left._1 > right._1 // 降序
                //left._1 < right._1 // 升序
                if ( left._1 > right._1  ) {
                    // true, false
                    true
                } else if ( left._1 == right._1 ) {
                    left._2 < right._2
                } else {
                    // true. false
                    false
                }
            }
        ))

    }
}
