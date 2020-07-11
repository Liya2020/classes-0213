package com.atguigu.bigdata.scala.chapter11

object Scala01_Generic {

    def main(args: Array[String]): Unit = {

        // TODO 泛型
        // TODO 不要求大家自己写，能看懂就行
        // 泛型一般在框架中使用，为了考虑通用性。
        // 默认Scala中的泛型和java是一致的。
        // scala中声明泛型，采用的是中括号
        // TODO 泛型不可变
        // [T]
        //val a1 : AAA[User] = new AAA[Parent] // error
        //val a2 : AAA[User] = new AAA[User]
        //val a3 : AAA[User] = new AAA[SubUser] // error
        //val a4 : AAA[User] = new AAA[Emp] // error

        // TODO 泛型协变 ： 将泛型作为类型的一部分来理解
        // [+T]
        // 泛型可以将子类型当成父类型使用
        // BBB[SubUser] 当成 BBB[User]子类型
//        val a1 : BBB[User] = new BBB[Parent] // error
//        val a2 : BBB[User] = new BBB[User]
//        val a3 : BBB[User] = new BBB[SubUser] // ok
//        val a4 : BBB[User] = new BBB[Emp] // error

        // TODO 泛型逆变：将泛型作为类型的一部分来理解
        // [-T]
        // 泛型可以将父类型当成子类型使用
        // CCC[Parent] 当作 CCC[User]子类型
//        val a1 : CCC[User] = new CCC[Parent] // ok
//        val a2 : CCC[User] = new CCC[User]
//        val a3 : CCC[User] = new CCC[SubUser] // error
//        val a4 : CCC[User] = new CCC[Emp] // error

        // TODO 泛型上限
        // [ <: ]
        val ddd = new DDD()

//        ddd.test1[Emp](new Emp())  //error
//        ddd.test1[Parent](new Parent()) //error
//        ddd.test1[User](new User()) // ok
//        ddd.test1[SubUser](new SubUser()) // ok

        // TODO 泛型 下限
        // [ >:]
//        ddd.test2[Emp](new Emp())  //error
//        ddd.test2[Parent](new Parent()) //ok
//        ddd.test2[User](new User()) // ok
//        ddd.test2[SubUser](new SubUser()) // error

        // TODO 具体例子
        val list:List[Int] = List(1,2,3,4)
        // 将数据统计结果变为：1234
        // List(1,2,3,4) => "1" + "2"+"3" + "4" ="1234".toInt
        // A => Int
        // A1 >: A =>  AnyVal, Any
        // (A1,A1)=>A1
        //val i: Int = list.reduce()
//        val list1: List[Any] = "" +: list // List("",1,2,3,4)
//        val result: Any = list1.reduce(
//            (x, y) => {
//                x + y.toString
//            }
//        )
//        val int: Int = result.toString.toInt
//        println(int)
//        val strings: List[String] = list.map(num=>num.toString)
//        println(strings.reduce(_ + _).toInt)

//        val lon : AnyVal = 10
//        val b : Byte = 10
//        list.fold(lon)(
//            (x, y) => {
//                x
//            }
//        )
        // TODO fold方法要求数据处理的类型和初始值的类型之前应该有关系
//        list.fold[AnyVal](b)(
//            (x, y) => {
//                x
//            }
//        )
//        val bb: Long = list.fold(b)(_+_)

        // TODO foldLeft数据处理的类型和初始值的类型无关
       //val str: String = list.foldLeft("")(_+_)
//        println(str.toInt)

        // 两个map的合并
        // map, kv
        val map1 = Map("a"->1, "b"->2)
        val map2 = Map("a"->1, "b"->2)
        // 这里的kv不再是键值对对象
        println(map1.fold(map2)(
            (map, kv) => {
                map
            }
        ))

        println(map1.foldLeft(map2)(
            (map, kv) => {
                map
            }
        ))


    }
    class AAA[T] {

    }
    class BBB[+T] {

    }
    class CCC[-T] {

    }
    class DDD {
        // TODO 泛型上限(应用范围越来越小)
        def test1[T <: User](t:T) ={

        }
        // TODO 泛型下限(应用范围越来越大)
        def test2[T >: User](t:T) ={

        }
    }
    class Parent {

    }
    class User extends Parent {

    }
    class SubUser extends User {

    }
    class Emp {

    }
}
