package com.atguigu.bigdata.scala.chapter05

object Scala10_Function_Hell2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 地狱版
        def sum( x:Int, y:Int ): Int = {
            x + y
        }

        def calcAnalysis( f : (Int, Int) => Int ) = {
            val boyCnt = 23
            val girlCnt = 25
            f(boyCnt,girlCnt )
        }

        //val f = sum _
        //println(calcAnalysis(f))

        //calcAnalysis( (x:Int, y:Int) => { x + y } )
        //calcAnalysis( (x:Int, y:Int) =>  x + y )
        //calcAnalysis( (x, y) =>  x + y )
        println(calcAnalysis(_ + _))

        def ttt: String = {
            "zhangsan"
        }

        val t : () => String = ttt _

        def test( f : => String ): Unit = {
            println(f)
        }

        test(ttt)
    }

}
