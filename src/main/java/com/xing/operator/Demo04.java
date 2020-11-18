package com.xing.operator;

public class Demo04 {
    public static void main(String[] args) {
        //运算符 ++ 和--的区别 自增，自减
        //一元运算符 一元指的是一个元素
        int a=3;
        int b=a++;                    //程序执行后，先把a赋值给b
        System.out.println ("b="+b);
        System.out.println ("a="+a);  //a++执行之后，b还是原来的a的值，之后把a的值加一变为a=4
        System.out.println ("===========");

        int c=++a;                   //程序之前之前先a的值自己加1之后，再赋值给c,变为5输出。此时a=5,b=3,c=5,
                                     //因为程序是从上往下执行的

        System.out.println ("a="+a);
        System.out.println ("b="+b);
        System.out.println ("c="+c);
        System.out.println ("===========");
        double pow = Math.pow (3, 3);
        System.out.println (pow);

    }
}
