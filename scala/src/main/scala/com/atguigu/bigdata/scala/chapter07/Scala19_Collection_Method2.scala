package com.atguigu.bigdata.scala.chapter07

object Scala19_Collection_Method2 {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 集合 - 常用方法 - 操作数据
        val list11 = List(1,2,3,4,5,6)

        // TODO map : 映射转换 A => B
        // 100%的需求会用到map
//        def transform( i:Int ): Int = {
//            i * 2
//        }

        // map方法可以将集合通过指定的转换规则变成新的集合
        // 指定的转换规则会对集合的每一条数据起作用
        //val newList: List[Int] = list.map(transform)
//        val newList: List[Int] = list.map((i:Int)=>{i*2})
//        val newList: List[Int] = list.map((i:Int)=>i*2)
//        val newList: List[Int] = list.map((i)=>i*2)
//        val newList: List[Int] = list.map(i=>i*2)
        val newList: List[Int] = list11.map(_*2)
        //println(newList)

        // TODO flatten : 扁平化
        // 所谓的扁平化，其实就是将整体拆分成一个一个的个体使用的方法。
        // 扁平化操作默认只能对外层数据进行操作，内层的数据无法进行操作。
        // 1::list:::Nil
//        val list1 = List(
//            List(
//                List(1,2)
//            ), List(
//                List(3,4)
//            )
//        )

        //println(list1.length) // 2
        // 1,2,3,4 => 2,4,6,8
//        println(list1)
//        println(list1.flatten)
//        println(list1.flatten.flatten)

        // TODO 扁平映射 = 扁平化(自定义规则) + 映射
//        val list = List(
//            List(1,2), List(3,4)
//        )

        //println(list.flatten.map(_ * 2))
        // 方法中的参数表示集合中的每一个元素
        // 方法返回的参数类型为可迭代的集合类型
//        def transform( list:List[Int] ): List[Int] = {
//            list.map(_*2)
//        }
//
//        println(list.flatMap(transform))
//        println(list.flatMap((list)=>{list.map(_*2)}))
//        println(list.flatMap((list)=>list.map(_*2)))
        //println(list.flatMap(list=>list.map(_*2)))
        //println(list.flatMap(_.map(_*2)))

//        val list = List("hello scala", "hello spark")
        // string
        // hello, scala, hello, spark
        //println(list.flatten)
//        def transform( s:String ) = {
//            s.split(" ")
//        }
//
//        println(list.flatMap(transform))
//        println(list.flatMap(_.split(" ")))

        //val list = List("hello scala", "hello spark")

        // 从原理上来讲，做不了扁平化
//        val list = List(1,2,3,4)
//        println(list.flatMap((num) => {
//            List(num * 2)
//        }))

        // TODO 过滤
        // 按照指定的规则对集合中的每一条数据进行筛选过滤。
        // 满足条件的数据保留，不满足条件的数据丢弃
//        val list = List(1,2,3,4)
//        println(list.filter((num) => {
//            num % 2 == 0
//        }))

//        val list = List("hello", "spark", "scala", "hadoop")
//        println(list.filter(word => {
//            word.startsWith("s")
//        }))

        // TODO 分组
        // 按照指定的规则对集合中的每一个数据进行分组
        // 指定的规则其实是一个函数，这个函数的返回结果进行分组的key
        // 分组后数据类型为Map
        // map中key就是分组的key，value就是同一个组的数据集合
//        val list = List(1,2,3,4)
        // 1 % 2 => 1
        // 2 % 2 => 0
        // 3 % 2 => 1
        // 4 % 2 => 0

//        val map: Map[Int, List[Int]] = list.groupBy(num => {
//            num % 2
//        })
//        println(map)

//        val list = List("hello", "hello", "scala")
//        println(list.groupBy(
//            word => {
//                word
//            }
//        ))

        // TODO 排序
        // 将集合中每一个数据按照指定的规则进行排序
        // 默认排序为升序
        // sortBy可以使用函数柯里化实现降序
//        val list = List(3,1,4,2)
//        println(list.sortBy(num => num))
//        println(list.sortBy(num => -num))
//        println(list.sortBy(num => num).reverse)
//        println(list.sortBy(num => num)(Ordering.Int.reverse))
        //val list = List("1", "2", "11", "3")

        // 字符串的排序可以按照字典顺序
        //println(list.sortBy(s => s))
        // "1" => 1
        // "2" => 2
        // "11" => 11
        // "3"  => 3
        //println(list.sortBy(s => s.toInt))

        // 自定义类型数据排序
        val user1 = new User()
        user1.age = 20
        user1.name = "zhangsan"

        val user2 = new User()
        user2.name = "lisi"
        user2.age = 20

        val user3 = new User()
        user3.name = "wangwu"
        user3.age = 10

        val list = List(user2, user1, user3 )

        // scala中的元组自动比较大小。
        // 先比较第一个元素，再比较第二个元素，异常类推
        println(list.sortBy(user => {
            (user.age, user.name)
        }))

    }
    class User {
        var name : String = _
        var age : Int = _

        override def toString: String = {
            s"User[$name, $age]"
        }
    }
}
