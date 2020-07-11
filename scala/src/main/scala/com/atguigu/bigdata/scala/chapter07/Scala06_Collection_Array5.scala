package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala06_Collection_Array5 {

    def main(args: Array[String]): Unit = {

        // foreach
        // 循环遍历
        val array = Array(1,2,3,4)

//        def fun(i:Int): Unit = {
//            println(i)
//        }
//        array.foreach(fun)
//        array.foreach((i:Int)=>{println(i)})
//        // 至简原则
//        array.foreach((i:Int)=>println(i))
//        array.foreach((i)=>println(i))
//        array.foreach(i=>println(i))
//        array.foreach(println(_))
        //array.foreach(println)

//        val array = TestArray(1,2,3,4)
//
//        def fun( i:Int ): Unit = {
//            println(i)
//        }
//
//        array.foreach(fun)

//        var myMatrix = Array.ofDim[Int](3,3)
//        myMatrix.foreach(list=>list.foreach(println))

        val arr1 = Array(1,2,3,4)
        val arr2 = Array(5,6,7,8)

        val arr6: Array[Int] = Array.concat(arr1, arr2)
        println(arr6.mkString(","))

        val arr7: Array[Int] = Array.range(1,5)
        println(arr7.mkString(","))

        val arr8:Array[Int] = Array.fill[Int](5)(-1)
        println(arr8.mkString(","))
    }
    class TestArray {
        val buffer = new ArrayBuffer[Int]()
        def foreach( f : Int => Unit ): Unit = {
            for ( i <- buffer ) {
                f(i)
            }
        }
    }
    object TestArray {
        def apply(is:Int*) = {
            val array = new TestArray()
            for ( i <- is ) {
                array.buffer.append(i)
            }
            array
        }


    }
}
