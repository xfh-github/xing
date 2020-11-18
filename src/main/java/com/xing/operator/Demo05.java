package com.xing.operator;

public class Demo05 {
    public static void main(String[] args) {
        //逻辑运算符
        // && 与运算 两个都为真，结果为真
        // || 或运算 两个只要有一个为真，就可以为真
        // !&& 非运算（取反）如果是真，则变为假，如果是假，则变为真

        boolean a=true;
        boolean b=false;


        System.out.println ("===========");
        System.out.println ("a&&b->a与b的值为："+(a&&b));
        System.out.println ("a||b->a或b的值为："+(a||b));
        System.out.println ("！a&&b->a&&b的值取反为："+!(a&&b));



        System.out.println ("===========");
        //短路运算
        int c=8;
        boolean d=(c<4)&&(c++<4);
        System.out.println (d);
        System.out.println (c);


    }
}
