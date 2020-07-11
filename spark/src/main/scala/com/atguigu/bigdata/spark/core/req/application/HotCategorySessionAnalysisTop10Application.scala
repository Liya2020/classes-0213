package com.atguigu.bigdata.spark.core.req.application

import com.atguigu.bigdata.spark.core.req.controller.{HotCategoryAnalysisTop10Controller, HotCategorySessionAnalysisTop10Controller}
import com.atguigu.summer.framework.core.TApplication

object HotCategorySessionAnalysisTop10Application extends App with TApplication{

    // TODO 热门品类前10应用程序
    start("spark") {
        val controller = new HotCategorySessionAnalysisTop10Controller
        controller.execute()
    }
}
