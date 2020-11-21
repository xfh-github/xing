package com.xing.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //二维数组
        /**
         * 1,2  a[0][0],a[0][1]
         * 4,2  a[1][0],a[1][1]
         * 6,2  a[2][0],a[2][1]
         * 8,1  a[3][0],a[3][1]
         */
        int[][] a={{1,2},{4,2},{6,2},{8,1}};
       // printf (a[0]);

        System.out.println (a[0][0]);
        System.out.println (a[0][1]);
        System.out.println (a[1][0]);
        System.out.println (a[1][1]);
    }

    public static void printf(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println (a[i]);
        }
    }

}
