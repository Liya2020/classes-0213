package com.atguigu.bigdata.scala.chapter06

object Scala22_Method_Instance4 {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 构造方法

        // 如果父类有构造方法，怎么办？
        // Person => User
        // new User(String name) => new Person(name)
        // 构建子类对象时，应该首先构建父类对象，如果父类的构造方法有参
        // 那么子类在构建父类对象也应该传递参数。
        // Scala中如何向父类的构造方法中传参？
        // 在父类名称的后面加括号就可以传参了。
        //val user = new User()
        val emp = new Emp("lisi")
    }
    class Person(name:String) {
        println("person name = " + name)
    }
    class User extends Person("zhangsan"){
        println("user....")
    }
    class Emp(name:String) extends Person(name) {
        println("emp...")
    }

}


