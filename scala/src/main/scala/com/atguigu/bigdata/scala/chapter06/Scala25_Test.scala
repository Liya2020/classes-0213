package com.atguigu.bigdata.scala.chapter06

object Scala25_Test {
    def main(args: Array[String]): Unit = {

        // 第一种构建对象 : new
        //val dept1 = new Dept03()
        
        // 第二种构建对象 : apply
        val dept2 = Dept03()

        // 第三种方式 ：反射
        val clazz: Class[Dept03] = classOf[Dept03]
        val dept3: Dept03 = clazz.newInstance()

        // 第四种方式：clone => protected => private => private[] => 公共
        //                   => 父子类 => 继承 => object => any
        // 一根线：
        //dept3.clone()

        // 第五种方式 ：反序列化


    }
}

class Dept03 {
    protected def getDeptName(): String = {
        return "xxxx"
    }
}
object Dept03 {
    def apply(): Dept03 = new Dept03()
}

class SubDept1 extends Dept03 {


}
class SubDept2 extends Dept03 {

}
