package com.xing.method;

public class Demo01 {
    //main方法
    //方法的定义： 修饰符 返回值类型 方法名字 （参数类型 参数名）{
    // 方法体
    // reture 返回值；
    // }
    //

    public static void main(String[] args) {
        //方法的含义：
        int sum = add (1, 2);
        System.out.println (sum);
    }

    //加法
    public static int add(int a,int b){
        return a+b;
    }
}
