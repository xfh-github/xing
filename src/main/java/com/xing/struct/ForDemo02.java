package com.xing.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0到100之间奇数和偶数的和

        //1 3 5 7 9
        //2 4 6 8 10

        int sum1=0;
        int sum2=0;
        for (int i = 1; i <=100 ; i=i+2) {
            System.out.println (i);
            sum1=sum1+i;
        }

        for (int j = 2; j <=100 ; j=j+2) {
            System.out.println (j);
            sum2=sum2+j;
        }
        System.out.println ("============");
        System.out.println (sum1);
        System.out.println (sum2);
        int sum = sum1 + sum2;
        System.out.println ("总和为==================");
        System.out.println (sum);


    }
    }
