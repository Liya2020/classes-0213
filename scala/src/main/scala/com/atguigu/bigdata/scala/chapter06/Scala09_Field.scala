package com.atguigu.bigdata.scala.chapter06

object Scala09_Field {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - 属性
        // 在类中声明属性就等同于在类中声明局部变量的感觉，可以使用var，val声明
        // 可以通过对象在外部访问
        val user = new User09()
        user.name = "zhangsan"
        println("name = " + user.name)

        // 变量应该显示的初始化。
        // 如果想要象java中类的属性初始化一样，需要采用特殊的符号：下划线

        // 如果属性使用val来声明。那么初始值不能使用下划线，需要显示的赋值。
        // 使用val声明的属性也不能改。
        //user.sex = "女"

    }
}
class User09 {

    // 属性
    var name : String = _
    var age : Int = _
    val sex : String = "男"

}
