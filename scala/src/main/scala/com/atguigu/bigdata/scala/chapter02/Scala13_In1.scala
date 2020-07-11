package com.atguigu.bigdata.scala.chapter02

import java.io.FileInputStream

import scala.io.{BufferedSource, Source}


object Scala13_In1 {

    def main(args: Array[String]): Unit = {

        // TODO 输入 - 文件
        // 从相对路径中读取文件数据
        // IDEA中的相对路径，是以Project的根（root）路径为基准
        // project + /input/word.txt
        val source: BufferedSource = Source.fromFile("input/word.txt")
        val strings: Iterator[String] = source.getLines()
        while (strings.hasNext) {
            println( strings.next() )
        }
        println("****************")
        source.foreach(line=>println(line))
        source.close()

        //val + = "zhangsan"

        //println(+.+(1))



    }
}
