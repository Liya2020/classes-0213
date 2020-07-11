package com.atguigu.bigdata.scala.chapter07

object Scala01_Collection_Array {

    def main(args: Array[String]): Unit = {

        // Scala - 集合 - 数组

        // 创建数组对象
        // 数组的字符串打印：[Ljava.lang.Object;@4cdbe50f
        // 可以设定泛型，改变数组的类型
        // new Array[String](5)编译后会自动生成java的数组代码
        // java : String[] array = new String[5];
        //        array[0] = "zhangsan"
        val array = new Array[String](5)

        // 向数组中添加数据
        // scala中范围数组指定的元素需要采用小括号，而不是中括号
        array(0) = "zhangsan"
        array(1) = "zhangsan1"
        array(2) = "zhangsan2"
        array(3) = "zhangsan3"
        array(4) = "zhangsan4"

        val ints = List("a", "b", "c", "d")

        // 遍历数组中数据

        // 可以采用for循环的方式遍历
//        for ( s <- array ) {
//            println("s = " + s)
//        }
        // 按照规则生成字符串
        println(array.mkString(","))


    }
}
