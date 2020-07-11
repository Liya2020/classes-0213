package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable


object Scala13_Collection_Map1 {

    def main(args: Array[String]): Unit = {

        // Scala - 集合 - Map - 映射 - 可变
        val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)

        // 添加数据
        map.put("d", 4)

        // 修改数据
        //map.update("d", 5)
        map("a") = 6

        // 删除数据
        map.remove("a")


        println(map)



    }
}
