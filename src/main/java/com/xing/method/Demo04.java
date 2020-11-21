package com.xing.method;

public class Demo04 {
    public static void main(String[] args) {
        //阶乘 递归


        int f = f (6);
        System.out.println (f);
    }

    public static int  f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f (n-1);
        }

    }
}
