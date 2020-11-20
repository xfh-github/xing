package com.xing.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //打印九九乘法表

        // 1*1=1
        // 1*2=2 2*2=4
        // 1*3=3 2*3=6 3*3=9

        for (int j = 1; j <=9 ; j++) {
            for (int i = 1; i <=j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println ();
        }


    }
}
