package com.atguigu.bigdata.java.chapter01;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test05_Net_Client {
    public static void main(String[] args) throws Exception {

        // 客户端
        Socket socket = new Socket("localhost", 9999);

        // Output
        User05 user = new User05();
        user.name = "zhangsan";
        // 序列化对象

        // java.io.NotSerializableException
        ObjectOutputStream objOut = new ObjectOutputStream(socket.getOutputStream());
        objOut.writeObject(user);
        System.out.println("客户端发送的对象数据");
        socket.close();

    }
}
