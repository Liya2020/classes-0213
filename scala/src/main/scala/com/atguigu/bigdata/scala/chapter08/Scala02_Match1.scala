package com.atguigu.bigdata.scala.chapter08

object Scala02_Match1 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 模式匹配 - 规则


        // int[] var10000 = new int[]{1, 2, 3};
        //val array:Array[Int] = Array(1,2,3)
        //val array = Array("1","2")
        //val list = List(1,2,3)
        //describe1(list)
//        val list = List(1,"2",3,List(4,5))
//        val result = list.flatMap(data=>{
//            data match {
//                case a:List[_] => a
//                case b => List(b)
//            }
//        })
//        println(result)
        // TODO 匹配列表
        val list: List[Int] = List(1, 2, 5, 6, 7)
        val list1: List[Int] = List(1, 2)
        val list2: List[Int] = List(1)

        // 1::2::3::Nil
        list2 match {
            case first :: second :: rest => println(first + "-" + second + "-" + rest)
            case _ => println("something else")
        }

        for (list <- Array(
            List(0), // 0
            List(1, 0), // 1，0
            List(0, 0, 0), // 0 ...
            List(1, 0, 0), // something else
            List(88))) { // something else
            val result = list match {
                case List(0) => "0" //匹配List(0)
                case List(x, y) => x + "," + y //匹配有两个元素的List
                case List(0, _*) => "0 ..."
                case _ => "something else"
            }

            //println(result)
        }

        // TODO 匹配数组
        for (arr <- Array(
            Array(0), // 0
            Array(1, 0), // 1，0
            Array(0, 1, 0), // 以0开头的数组
            Array(1, 1, 0), // something else
            Array(1, 1, 0, 1),// something else
            Array("hello", 90))) { // hello，90

            val result = arr match {
                case Array(0) => "0" //匹配Array(0) 这个数组
                case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
                case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
                case _ => "something else"
            }
            //println("result = " + result)
        }

        // TODO 匹配类型
        // 下划线的作用省略参数，因为逻辑中不使用参数，所以可以省略
        // 但是需要这个参数，那么可以起个名字
        // 类型匹配不考虑泛型的:数组的泛型其实是类型的一部分。
        // 底层实现采用类型判断
        def describe1(x: Any) = {
            val result = x match {
                case i: Int => "Int"
                case s: String => "String hello"
                case m: List[String] => "List"
                case c: Array[Int] => "Array[Int]"
                case someThing => "something else " + someThing
            }
            println( result )
        }

        // TODO 匹配常量 : final, val
        def describe(x: Any) = {
            val result = x match {
                case 5 => "Int five"
                case "hello" => "String hello"
                case true => "Boolean true"
                case '+' => "Char +"
            }
            println( result )
        }
        //describe("abc")

    }
}
