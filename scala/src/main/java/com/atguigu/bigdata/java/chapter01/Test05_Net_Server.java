package com.atguigu.bigdata.java.chapter01;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05_Net_Server {
    public static void main(String[] args) throws Exception {

        // 服务器
        ServerSocket server = new ServerSocket(9999);
        Socket client = server.accept();
        // Input 反序列化
        ObjectInputStream objInput = new ObjectInputStream(client.getInputStream());
        User05 user = (User05)objInput.readObject();
        System.out.println("服务器读取的用户数据为 " + user.name);


    }
}
