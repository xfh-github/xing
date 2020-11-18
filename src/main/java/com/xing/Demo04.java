package com.xing;

public class Demo04 {
    public static void main(String[] args) {
        //整体扩展： 进制 二进制0b 十进制 八进制0 十六进制0x

        int i=10;     //十进制
        int i8=010;   //八进制0
        int i16=0x10; //十六进制0x

        System.out.println (i);
        System.out.println (i8);
        System.out.println (i16);
        System.out.println ("==================================");
        //银行业务 使用float和double有问题
        float f=0.1f;
        double d=1.0/10;
        System.out.println (f==d);


        float d1=2713716876311f;
        float d2=d1+1;
        System.out.println (d1==d2);

        //字符串扩展 所有的字符本质还是数字 编码 unicode 两个字节
        System.out.println ("字符串扩展============");
        char c1='a';
        char c2='忍';

        System.out.println ((int)c1);
        System.out.println ((int)c2);

        System.out.println ("转义字符============");
        //转义字符
        // \t 制表符
        // \n 换行符号
        //还有很多转义字符
        System.out.println ("Hello\tWorld");
        System.out.println ("Hello\nWorld");

        System.out.println ("字符数值是否相同============");

        String sa=new String ("Hello World");
        String sb=new String ("Hello World");
        System.out.println (sa==sb);

        String sc="Hello World";
        String sd="Hello World";
        System.out.println (sc==sd);
        // 对象 从内存分析

        //布尔值扩展 if(flag==true){}和if(flag){} 是一样的
        Boolean flag=true;
        if (flag==true){}
        if (flag){}
        //less is more! 代码要精简易读





    }
}
