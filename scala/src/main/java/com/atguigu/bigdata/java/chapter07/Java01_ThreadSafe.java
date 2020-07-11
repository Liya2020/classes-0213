package com.atguigu.bigdata.java.chapter07;

public class Java01_ThreadSafe {
    public static void main(String[] args) throws Exception {

        User user = new User();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "zhangsan";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "lisi";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕：");

        // 1. 总共几个线程？
        //   t1, t2, main
        // 2  哪几个线程休眠了。
        //   t1(1000), t2(1000)
        // 3 哪个线程在执行
        //   main
        // 4. 打印顺序
        //   main方法执行完毕
        //   zhangsan(lisi)
        //   lisi(zhangsan)
        // TODO 所谓的线程安全问题，其实就是多线程并发时，
        //      对共享内存中共享对象的属性进行修改所导致的数据冲突问题。
        //  1. 线程串行，不推荐
        //  2. 让对象存储的内存不共享（栈）
        //  3. 让对象不共享，多例对象
        //  4. 调用对象的方法不会出现线程安全问题。因为压栈操作是独享操作。
        //  5. 如果只是访问属性，而不是修改属性，那么也不会出现线程安全问题。

    }
}
class User {
    public String name;
}