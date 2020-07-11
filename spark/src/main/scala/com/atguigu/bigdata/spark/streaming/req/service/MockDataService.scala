package com.atguigu.bigdata.spark.streaming.req.service

import com.atguigu.bigdata.spark.streaming.req.dao.MockDataDao
import com.atguigu.summer.framework.core.TService

class MockDataService extends TService{

    private val mockDataDao = new MockDataDao

    /**
      * 数据分析
      *
      * @return
      */
    override def analysis() = {
        // TODO 生成模拟数据
        //import mockDataDao._
        val datas  = mockDataDao.genMockData()
        //val a = Seq("a")

        // TODO 向Kafka中发送数据
        mockDataDao.writeToKakfa(datas)


    }
}
