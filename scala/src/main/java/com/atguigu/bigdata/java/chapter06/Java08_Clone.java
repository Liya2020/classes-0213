package com.atguigu.bigdata.java.chapter06;

public class Java08_Clone {
    public static void main(String[] args) throws Exception {

        AAA aaa = new AAA();
        // 方法的提供者：java.lang.Object
        // 方法的调用者：com.atguigu.bigdata.java.chapter06.Java08_Clone
        //aaa.clone();
        aaa.toString();
    }
}
class AAA {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
