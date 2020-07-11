package com.atguigu.bigdata.scala.chapter05

import com.atguigu.summer.framework.core.Application

import scala.annotation.tailrec


object Scala19_Function10 {

    def main(args: Array[String]): Unit = {

        // TODO 递归 - 普通递归
        // 1. 方法执行过程中调用自身
        // 2. 存在可以跳出递归的逻辑，可能会出现StackOverflowError(栈溢出)
        // 3. 方法调用时，传递的参数之间应该存在规律
        // 4. Scala中递归方法需要明确返回值类型,不能省略

        // TODO 递归 - 尾递归
        // 递归的方法不依赖于其他外部的变量
        // 编译器碰见尾递归操作时会自动优化为while循环。

        // 阶乘 5！
        // 一个大于1的数的阶乘等于这个数乘以它减一的阶乘
        //println(factorial(5))
        // 扩大栈内存的大小 JVM
        //println(test(10000000))

        //fun()

        // 5, 5 + 1
        // 4, 4 + 5 + 1
        // 3, 3 + 4 + 5 +1
        // 2. 2 + 3 + 4 + 5 + 1
        // 1. 1 + 2 + 3 + 4 + 5 + 1
        println(test1(5, 1))
    }
    def test1( num:Int, result:Int ):Int = {
        if ( num < 1 ) {
            result
        } else {
            test1( num-1, num + result )
        }
    }

    def fun(): Unit = {
        println("xxxxx")
        fun()
    }

    /**
      * 阶乘
      * @param num
      * @return
      */

    def factorial( num:Int ):Int = {
        if ( num < 1 ) {
            1
        } else {
            num * factorial(num-1)
        }
    }
    def test( num:Int ):Int = {
        if ( num < 1 ) {
            1
        } else {
            num + test(num-1)
            //test(num-1)
        }
    }

}
