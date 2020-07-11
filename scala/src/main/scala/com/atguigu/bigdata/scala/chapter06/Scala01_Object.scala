package com.atguigu.bigdata.scala.chapter06

import java.util.ArrayList
object Scala01_Object {

    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象
        // TODO Scala的基本面对象的语法和java是相同的。
        /*
            Java :

            package com.atguigu.bigdata.xxxxxx

            import java.util.*

            public class Dept {
                private Strign name;
            }

            public class JavaUser06 {
                public Dept dept;
                private String name;
                public void setName( String name ) {
                    this.name = name;
                }
                public String getName() {
                    return this.name;
                }
            }

            Dept d = new Dept();
            JavaUser06 user = new JavaUser06();
            user.dept = d;

         */

        val dept : Dept01 = new Dept01()

        val user : User01 = new User01()
        user.dept = dept
        user.name = "lisi"
        user.test()
        println(s"用户${user.name}所在的部门${user.dept.name}")

    }
}
class Dept01 {
    var name : String = "开发部门"
}
class User01 {
    var dept : Dept01 = null
    var name : String = "zhangsan"

    def test(): Unit = {
        println("user  test...")
    }
}
