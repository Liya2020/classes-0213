package com.atguigu.bigdata.scala.chapter02

import java.io.{FileWriter, PrintWriter}

import scala.io.Source


object Scala14_Out {

    def main(args: Array[String]): Unit = {

        // TODO 输出
        val out = new PrintWriter(
            new FileWriter("output/test.txt")
        )

        out.println("zhangsan")
        out.flush()
        out.close()


    }
}
