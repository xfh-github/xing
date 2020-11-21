package com.xing.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {

        int[] a={1,32,54,11,4232,56,6,8};
        System.out.println (a);               //打印的是对象的hashcode
        //打印数组元素Arrays.toString()
        System.out.println (Arrays.toString (a));
        System.out.println ("============");
        printf (a);
    }

    //自己写个工具类
    public static void printf(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                System.out.print ("[");
            }
            if(i==a.length-1){
               System.out.print (a[i]+"]");
        }else {
                System.out.print (a[i]+", ");
            }
        }
    }

}
