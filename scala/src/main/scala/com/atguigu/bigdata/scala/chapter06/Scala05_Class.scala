package com.atguigu.bigdata.scala.chapter06

object Scala05_Class {
    def main(args: Array[String]): Unit = {

        // TODO Scala - 面向对象 - Class

        // class 和 object 的区别？
        // TODO object 其实在编译时会产生两个类文件，
        //        一个是当前类的文件, 还有一个是单例的类文件
        // 如：Scala05_Class.class, Scala05_Class$.class
        // TODO class  其实在编译时只会产生当前类的class缩文件
        //  如：  Scala05_Class.class
        // class其实就是用修饰普通的类。
        //而object用于修饰伴随着这个类所产生的一个单例对象，用于模仿java中的静态语法。
        // object中的方法和属性都可以通过类名直接访问，类似于静态语法。
        // 一般将使用object声明的类称之为伴生类，对应的那个单例对象称之为伴生对象。
        // 后来我们统一将相同名称的class，object声明的类做了区分：
        // 使用class声明的类：伴生类
        // 使用object声明的类：伴生对象


    }
}

