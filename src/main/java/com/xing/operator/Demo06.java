package com.xing.operator;

public class Demo06 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a+=b; //a=a+b
        System.out.println (a);
        a-=b; //a=a-b
        System.out.println (b);
        System.out.println ("a="+a);

        System.out.println ("==========");
        //字符串连接符  + String
        System.out.println ("a+b="+a+b); //字符串在前的话，后面的值会拼接
        System.out.println (a+b+"");     //字符串在后的话，前面的值会运算

    }
}
