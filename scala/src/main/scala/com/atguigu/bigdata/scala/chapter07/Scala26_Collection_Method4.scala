package com.atguigu.bigdata.scala.chapter07

object Scala26_Collection_Method4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法 - 操作数据

        // 计算
        val list = List(1,2,3,4,5,6)

        // mapReduce
        // TODO 简化，规约
        // reduce参数 ： 【op; (A1, A1) => A1】
        // reduce中传递的参数的规则：参数和返回值类型相同
        // 这里的参数其实就是集合中数据的类型
        // scala中集合的计算基本上都是两两计算
//        val i: Int = list.reduce( (a:Int, b:Int)=>{a + b} )
//        val i: Int = list.reduce( (a:Int, b:Int)=>a + b )
//        val i: Int = list.reduce( (a, b)=>a + b )

        // List(1,2,3,4)

        val i: Int = list.reduce(_-_) //
        //println(i)

        // 从源码的角度，reduce操作其实就是reduceLeft
        // reduceLeft参数 ： 【op; (B, Int) => B】
        // 这里的参数B，应该和Int类型有关系，才能使用
        val ii: Int = list.reduceLeft(_-_)
        //println(ii)

        // reduceRight参数 ： 【op; (Int, B) => B】
        // reversed.reduceLeft[B]((x, y) => op(y, x))
        // 1,2,3,4
        // 5, 4,3,2,1

        // (1 - (2 - (3 - (4 - 5)))) = -2
        // 如何判断计算方式：加括号
        // left : 从左边加括号
        //     (((((1 - 2) -3) - 4) - 5) - 6) => -19
        // right : 从右边加括号
        //    (1 - (2 - (3 - (4 - (5 - 6))))) => -3
        //
        val iii: Int = list.reduceRight(_-_)
        println(iii)
    }

}
