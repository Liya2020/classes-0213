package com.atguigu.bigdata.scala.chapter05

object Scala12_Function_QA {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 答疑
        // TODO 1. 函数的参数的值不能改
        //test("xxxx")

        // TODO 2. 匿名函数后面的代码不执行
        // 匿名函数没有只声明不调用。
//        val f = () => {
//            println("xxxxx")
//        }
//        println("yyyyy")

        // TODO 3. 匿名函数参数不使用的简化问题
        // 匿名函数使用下划线的时候可以简化参数列表
//        def test( f:(Int)=>Any ) = {
//            f(1)
//        }

        //test( (x:Int)=> {"Hello"} )
        //test( (x:Int)=>"Hello")
        //test( (x)=>"Hello")
        //test( x=>"Hello")
        //test( _ + "Hello" )
        // String => test => function
        // Byte => Short => int = > long
        //println(test("Hello"))
//        val a : (Int)=>Any = "abc"
//        a(1)

        // TODO 4. 循环反向操作
        // start end
        //    for ( i <- 5 to 1 by -1 ) {
        //        println(i)
        //    }

        // TODO 5. def fun : String = { "zhangsan" }, val aaa : ()=>String = fun 报错
        def fun : String  = {
            "zhangsan"
        }

        //val a = fun _
        //val user:JavaUser06 = new Emp()
        /////fun()
        //val a:()=>String = fun // => String

        //println(a())

        // TODO 6. 函数作为参数不理解
//        def test( i : Int ): Int = {
//            i * 2
//        }
//
//        def fun1( i:Int, f ): Unit = {
//            println(i * 2)
//        }

        // TODO 8. for()循环中的i为什么不声明为val或var
//        val i = 10
//
//        for ( int i = 1; i <= 5; i++ ) {
//
//        }
//        for ( i <- 1 to 5 ) {
//            println( i )
//        }

        // TODO 9
        def test (  a: Int):String = {
            return "xxxx"
        }

//        test 1
//        1 to 5
//        1 toString
    }
//    def test( name : String ): Unit = {
//        var name : String = "zhangsan"
//        name = "lisi"
//    }




}


