package com.xing;

public class Demo02 {
    public static void main(String[] args) {
        //强类型语言：要求所有的变量的使用必须遵循某种规范，所有的的变量，必须先定义后执行
        //若a变量没有赋值，在输出语句中会报错：Variable 'a' might not have been initialized
        String a="强类型语言"; //String指的是字符串
       // String b=10;
        /** 在String b=10 时
         Required type:String
         Provided:int
         */
        System.out.println (a);
    }
}
