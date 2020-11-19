package com.xing.struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        //死循环
        int i=1;
        int sum=0;
        while(i<=100){
            //等待客户端链接
            //定时检查
            //服务器的请求响应监听
            sum=sum+i;
            i=i+1;

        }
        System.out.println (sum);
    }
}
