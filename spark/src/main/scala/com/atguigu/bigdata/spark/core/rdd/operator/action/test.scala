package com.atguigu.bigdata.spark.core.rdd.operator.action

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

/**
 * @author Liya
 * @create 2020-06-27 9:48
 */
object test {
    def main(args: Array[String]): Unit = {
        val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD Action")
        val sc = new SparkContext(sparkConf)

        val rdd: RDD[(Int, String)] = sc.makeRDD(List((1, "a"), (1, "a"), (1, "a"), (2, "b"), (3, "c"), (3, "c")))
        val res: collection.Map[Int, Long] = rdd.countByKey()
        println(res.mkString(", ")) // 1 -> 3, 2 -> 1, 3 -> 2
    }



}
