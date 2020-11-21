package com.xing.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        //数组使用Arrays进行排序
        int[] a={1,32,54,11,4232,56,6,8};

        Arrays.sort (a);      //数组进行排序
        System.out.println (Arrays.toString (a));
        System.out.println ("===========");

        Arrays.fill (a,2,4,0);
        System.out.println (Arrays.toString (a));

    }

}
