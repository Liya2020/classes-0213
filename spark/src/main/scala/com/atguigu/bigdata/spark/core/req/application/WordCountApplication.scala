package com.atguigu.bigdata.spark.core.req.application

import com.atguigu.bigdata.spark.core.req.controller.WordCountController
import com.atguigu.summer.framework.core.TApplication
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object WordCountApplication extends App with TApplication{

    start( "spark" ) {

        val controller = new WordCountController
        controller.execute()

    }

}
