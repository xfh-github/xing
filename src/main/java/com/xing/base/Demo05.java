package com.xing.base;

public class Demo05 {
    //类型转换
    public static void main(String[] args) {
        int i=129;
        byte a= (byte) i; //内存溢出 超出byte的 -127——127
        System.out.println (a);
    }
}
