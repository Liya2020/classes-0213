package com.atguigu.bigdata.scala.chapter08

object Scala01_Match {

    def main(args: Array[String]): Unit = {



        /*
        int a = 5
        switch (a) {
            case 5 :
                System.out.println("other");
            default:
                System.out.println("other");
                break;
        }
         */
        // TODO case _ 的分支一般写在所有分支的最后，模仿default语法
        //      如果所有的分支都不匹配，还没有case  _分支，那么会发生错误
        var a: Int = 10
        var b: Int = 20
        var operator: Char = 'd'
        var result = operator match {

            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            //case _ => "illegal"
        }
        println(result)

    }
}
