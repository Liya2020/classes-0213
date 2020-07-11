package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala14_Field5_Access {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 访问权限
        // TODO private : 同类
        // 如果属性声明为private，那么编译器生成set，get方法时，也会使用private进行修饰。
        // 使用@BeanProperty注解后，属性不能声明为private
        val user = new User();
        user.test()

        // TODO private[包名] ：同类，同包
        // 中括号中的包名可以向上使用
        // 必须在当前包的作用域范围内

        // TODO protected ： 同类，子类

        // TODO （default） : 公共的
        // Scala中的源码文件中可以声明多个公共类

    }
    // 内部类
    class User {
        //@BeanProperty
        private var name : String = "zhangsan"
        private[chapter06] var age:Int = 20
        private[bigdata] var sex:String = "男"
        protected var tel:String = "123123123"
        var email:String = "xxxx@xxx.com"

        def test(): Unit = {
            println("name = " + name)
            println("age = " + age)
            println("sex = " + sex)
            println("tel = " + tel)
            println("tel = " + email)
        }
    }
    class SubUser extends User {
        def testSub(): Unit = {
            println(this.tel)
            //println(this.name)
            println(this.age)
            println(this.email)
        }
    }
    class Emp {
        def test(): Unit = {
            val user = new User()
            //user.name
            user.age
            user.sex
            //user.tel
            user.email
        }
    }
}

