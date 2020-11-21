package com.xing.array;

//数组学习
public class ArrayDemo02 {
    public static void main(String[] args) {
        //1.静态初始化
        // 创建+赋值
        //数组类型 数组标识符[] 数组变量名 =数组大括号赋值
        int[] a={1,3,5,6,7,89};
        for (int i = 0; i < a.length; i++) {
            System.out.print (a[i]);
        }
        System.out.println ();

        //2.动态初始化 包含默认初始化
        int[] b=new int[10];
        b[0]=10;
        System.out.println (b[0]);
        System.out.println (b[1]);

    }
}
