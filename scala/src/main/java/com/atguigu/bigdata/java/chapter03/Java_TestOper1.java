package com.atguigu.bigdata.java.chapter03;

public class Java_TestOper1 {
    public static void main(String[] args) {

        int i = 0;
        // 什么叫赋值 => 将等号右边的计算结果给左边
        // ++放置在变量的后面，先赋值，在加一
        // ++放置在变量的前面，先加一，再赋值。
        //int j = i++;
        // 1) _a = i++ =>
        //    1.1) _a = i,
        //    1.2) i=i+1
        // 2) i = _a
        i = i++; //
        System.out.println("i = " + i);

    }
}
