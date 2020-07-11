package com.atguigu.bigdata.scala.chapter05

object Scala05_Function4 {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程
        // 函数参数的个数
        // 最大个数为22，声明的时候可以超过22，但是将函数作为对象赋值给变量时会报错
        //val a : Function0~22
        def test(
                i1 : Int,
                i2 : Int,
                i3: Int,
                i4 : Int,
                i5 : Int,
                i6 : Int,
                i7 : Int,
                i8 : Int,
                i9 : Int,
                i10 : Int,
                i11 : Int,
                i12 : Int,
                i13 : Int,
                i14 : Int,
                i15 : Int,
                i16 : Int,
                i17 : Int,
                i18 : Int,
                i19 : Int,
                i20 : Int,
                i21 : Int,
                i22 : Int,
                i23 : Int
                ): Unit = {

        }
        //test(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3)
        //val a = test _


        // TODO 可变参数：相同类型的参数多次出现，但是不确定个数
        // java => String...
        // scala => String*
//        def test( i:Int* ): Unit = {
//            println(i)
//        }
//
//        test()
//        test(1)
//        test(1,2,3)

        // TODO 可变参数的顺序 : 放置在最后
//        def test(age:String, i:Int*): Unit = {
//
//        }
//
//        test("",2,3,4,20)
         //def test1( name:String*, age:Int* ): Unit = {

         //}

         // TODO Scala中函数的参数使用val声明，无法进行修改
        // Scala提供了参数默认值的语法来解决参数默认值的问题
//        def regUser( name:String, password:String ): Unit = {
//            var pswd = ""
//            if ( password == null ) {
//                pswd = "000000"
//            } else {
//                pswd = password
//            }
//
//        }

        // TODO 参数默认（初始）值: 参数声明时进行初始化
        def regUser( name:String, password:String = "000000" ): Unit = {
            println("password = " + password)
        }
        // TODO 如果函数存在默认值的参数，调用时可以不用传递。不传参数，会使用默认值
        //regUser("zhangsan")
        // TODO 如果调用函数时，提供了参数值，那么参数默认值不起作用，被覆盖了。
        //regUser("lisi", "123123")

        def regUser1( name:String, password:String = "000000", tel : String ): Unit = {
            println("name = "+name+",password = " + password+",tel =" + tel)
        }

        // TODO 函数在传递参数时，是按照从左到右的方式进行匹配的。
        //regUser1("zhangsan", "000000", "1233434324")

        // TODO 带名参数 ： 传递参数时添加参数名，明确指定参数
        regUser1("zhangsan", tel="12312312")

    }

}
