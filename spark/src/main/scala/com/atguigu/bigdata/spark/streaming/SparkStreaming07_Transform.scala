package com.atguigu.bigdata.spark.streaming

import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, InputDStream}
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}
import org.apache.spark.streaming.{Seconds, StreamingContext}

object SparkStreaming07_Transform {

    def main(args: Array[String]): Unit = {

        // TODO Spark环境
        // SparkStreaming使用核数最少是2个
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
        val ssc = new StreamingContext(sparkConf, Seconds(3))

        val ds = ssc.socketTextStream("localhost", 9999)
        // TODO 转换
        // Code Driver (1)
        val newDS: DStream[String] = ds.transform(
            rdd=>{
                // Code Driver(N)
                rdd.map(
                    data => {
                        // Code Executor(N)
                        data * 2
                    }
                )
            }
        )

        // Code : Driver(1)
        val newDS1 = ds.map(
            data => {
                // Code : Executor(N)
                data * 2
            }
        )

        newDS1.print()

        ssc.start()
        // 等待采集器的结束
        ssc.awaitTermination()
    }
}
