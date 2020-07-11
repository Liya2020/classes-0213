package com.atguigu.bigdata.java.chapter06;

public class Java03_Static {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        Thread.sleep(1000);
//                    }
//                }
        );
        Thread t2 = new Thread();

        t1.start();
        t2.start();

        // 1. 时间，2. 对象锁

        // 核心区别：字体上
        // 静态的方法在IDEA中默认就是斜体的
        // TODO 静态的方法和类型相关，和对象无关
        // sleep方法和t1无关，就不可能让t1休眠，让当前正在执行的线程（main）休眠
        // sleep无法释放对象锁
        t1.sleep(1000);
        // 成员的方法在IDEA中默认就不是斜体的。
        // TODO 成员方法和对象相关
        // wait方法和t2相关，所以会让t2等待
        // wait释放对象锁
        t2.wait();


    }
}
