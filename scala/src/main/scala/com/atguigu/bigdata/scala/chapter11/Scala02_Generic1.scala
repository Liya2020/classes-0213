package com.atguigu.bigdata.scala.chapter11

object Scala02_Generic1 {

    def main(args: Array[String]): Unit = {
        // 看懂
        def f[A : Test](a: A) = println(a) // Test[A]

        implicit val test : Test[User] = new Test[User]
        // 将泛型和隐式转换合二为一

        f( new User() )
    }
    class Test[T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
}
