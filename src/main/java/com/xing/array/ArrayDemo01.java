package com.xing.array;

public class ArrayDemo01 {
    public static void main(String[] args) {

        //变量的类型 变量的名字=变量的值
        //数组类型 数组标示符号[] 数组名 ；分号结尾为语句
        // int[] arrays;                //只是声明了一个数组。没有分配空间
        //数组元素通过索引访问的，数组元素的索引是从0开始

        int sum=0;
        int[] arrays1=new int[10];   //创建了一个数组，而且在内存中分配了10个int类型的空间

        //给数组元素赋值,数组有索引，下标,因为数据类型为int,所以可以赋值为整数
        arrays1[0]=0;
        arrays1[1]=1;
        arrays1[2]=2;
        arrays1[3]=3;
        arrays1[4]=4;
        arrays1[5]=5;
        arrays1[6]=6;
        arrays1[7]=7;
        arrays1[8]=8;
        arrays1[9]=9;

        for (int i = 0; i < arrays1.length; i++) {
            System.out.print (arrays1[i]+"\t");
            sum+=arrays1[i];
        }
        System.out.println ("数组的总和为："+sum);
    }
}
