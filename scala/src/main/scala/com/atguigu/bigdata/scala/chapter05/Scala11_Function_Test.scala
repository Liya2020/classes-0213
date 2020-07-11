package com.atguigu.bigdata.scala.chapter05

object Scala11_Function_Test {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 小练习

        // 1. 如果想把一个任意的数字A通过转换后得到它的2倍，那么这个转换的函数应该如何声明和使用
        def transform1(num:Double): Double = {
            num * 2
        }

        //println( transform1(5) )

        // 2. 如果上一题想将数字A转换为任意数据B（不局限为数字），转换规则自己定义，该如何声明
        def transform2(num:Double, f:(Double)=>Any): Any  = {
            f(num)
        }

        //val result = transform2(5, (d:Double)=>{ "Number is " + d })
        //println(result)

        // 3. 如果函数调用：  test(10,20,c)的计算结果由参数c来决定，这个参数c你会如何声明
        def test( x:Int, y:Int, c:(Int, Int)=>Any ) = {
            c(x, y)
        }

        //test(10, 20, (x:Int, y:Int)=>{ x + y })
        //test(10, 20, (x:Int, y:Int)=>x + y)
        //test(10, 20, (x, y)=>x + y)
        //test(10, 20, _ + _)

        /*
        4. 如果设计一个用于过滤的函数，你会如何做？
        要求：对传递的包含多个单词的字符串参数,根据指定的规则对word进行过滤
        例子："hello world scala spark" => 首写字母为s => "scala, spark"
         */
        // scala, spark, ssss, ssss
        // , scala, spark, ssss
        def filter( s:String, fun:(String)=>Boolean ): String = {
            val words: Array[String] = s.split(" ")
            var result = ""
            for ( word <- words ) {
                if ( fun(word) ) {
                    result += ", " + word
                }
            }
            result.substring(2 )
        }

        //filter( "hello world scala spark", (word:String)=>{ word.startsWith("s") } )
        println(filter("hello world scala spark", _.startsWith("s")))
    }

}


