package com.atguigu.bigdata.java.chapter08;

public class TestSwitch {
    public static void main(String[] args) {

        int a  = 30;

        // switch穿透现象
        switch (a) {
            default:
                System.out.println("other");
                break;
            case 5 :
            case 10 :
            case 20 :
                System.out.println("number");
                break;

        }
    }
}
