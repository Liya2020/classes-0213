package com.atguigu.bigdata.java.chapter03;

public class Java_TestOper2 {
    public static void main(String[] args) {

        // 阶乘 ： 一个大于1的数的阶乘等于这个数乘以它减一的阶乘
        // 5！ => 5 * 4! = 5 * 4 * 3! => 5 * 4 * 3 * 2! => 5 * 4 * 3 * 2 * 1
        System.out.println(test(5));
    }
    public static int test( int num ) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * test(num-1);
        }
    }
}
