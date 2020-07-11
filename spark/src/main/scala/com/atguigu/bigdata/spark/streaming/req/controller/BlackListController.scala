package com.atguigu.bigdata.spark.streaming.req.controller

import com.atguigu.bigdata.spark.streaming.req.service.BlackListService
import com.atguigu.summer.framework.core.TController

class BlackListController extends TController{

    private val blackListService = new BlackListService

    override def execute(): Unit = {
        val result = blackListService.analysis()
    }
}
