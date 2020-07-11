package com.atguigu.bigdata.scala.chapter08

object Scala05_Match4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 模式匹配 - 应用

        val list = List(("a",1), ("b",2), ("c",3))
        val newList = list.map(
            (t) => {
                (t._1, t._2*2)
            }
        )
        // 模式匹配时，小括号需要变成大括号
        // case后面的小括号不是参数列表的意思，表示元组
        // 模式匹配一般就在一个参数的使用
        val newList1 = list.map{
            case ( word, count ) => {
               ( word, count*2 )
            }
        }

        list.filter{
            case ( _, count ) => {
                count == 2
            }
        }
        list.flatMap{
            case ( word, count ) => {
                List(count)
            }
        }


        println(newList1)




        // 模式匹配 - 集合元素
       // val map = Map( "a" -> ("aa", 1) , "b" -> ("bb", 2))



        // foreach方法将集合中的每一个元素进行遍历
        // 如果匹配集合中的元组数据时，匹配需要使用case关键字。
        //list.foreach()
//        map.foreach(
//            (kv) => {
//                println(kv)
//            }
//        )
//
//
//        map.foreach{
//            case ( _, (_, count) ) => {
//                println(count)
//            }
//        }

        // 模式匹配 - 元组
        val (id, name, age) = ( 1, "zhangsan", 30 )
        val t = ( 1, "zhangsan", 30 )
//
//        println(t._2)


    }
}
