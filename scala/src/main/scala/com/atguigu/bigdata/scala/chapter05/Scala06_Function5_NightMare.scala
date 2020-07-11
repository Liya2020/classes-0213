package com.atguigu.bigdata.scala.chapter05

object Scala06_Function5_NightMare {

    def main(args: Array[String]): Unit = {

        // TODO Scala 函数式编程 - 噩梦版
        // Scala中函数有至简原则 ： 能省则省
        // 这里的能省则省，必须时编译器可以自动推断的场合，才能省
        def test(name:String) : String = {
            return "name = " + name
        }

        // TODO 1. 当函数需要返回值时，可以将函数体中最后一行执行的代码作为返回结果
        //         所以可以省略return关键字
        def test1(name:String) : String = {
            "name = " + name
        }

        //println(test1("zhangsan"))

        // TODO 2. 如果编译器可以推断出函数的返回值类型，那么返回值类型可以省略
        def test2(name:String)  = {
            //"name = " + name
            val age = 20
            if ( age < 20 ) {
                "zhangsan"
            } else {
                123
            }
        }

        //println(test2("zhangsan"))
        // TODO 3. 如果函数体逻辑只有一行代码，那么大括号可以省略
        def test3(name:String) = "name = " + name
        //println(test3("lisi"))

        // TODO 4. 如果函数没有提供参数，那么调用的时候，小括号可以省略
        //         如果函数没有提供参数,那么声明时，小括号也可以省略, 调用时，必须不能使用小括号
//        def test4() = "zhangsan"
//        println(test4())
//        println(test4)
        // 统一访问原则
        //def test4 = "zhangsan"
        //val abc = "zhangsan"
        //println(test4)

        // TODO 5. 函数如果明确使用Unit声明没有返回值，那么函数体中的return关键字不起作用的。
        //         函数体中如果明确使用return关键字，那么返回值类型不能省
        //         明确函数就是没有返回值，但是Unit又不想声明,那么可以同时省略等号
        //         将这种函数的声明方式称之为过程函数, 不省略花括号
//        def test5():Unit = {
//            return "zhangsan"
//        }
        //def test5() {
        //    return "zhangsan"
       // }

        //println(test5())

        // TODO 6. 当只关心代码逻辑，不关心函数名称时，函数名和def关键字可以省略
        //         将没有名称和def关键字的函数称之为匿名函数
        //         匿名函数规则： （参数列表） => { 代码逻辑 }
        // 函数调用 ： 函数（变量）名称（参数列表）
        // JS => 混淆 => a(),b()
        // 声明匿名函数
        val a = () => println("no name")

        // 调用
        a()

    }

}
