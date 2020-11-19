package com.xing.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        //练习1：计算1——100之间的奇数和偶数的和

        int oddSum=0;
        int evenSum=0;

        for (int i = 0; i <=100; i++) {
            if(i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println ("奇数总和为："+oddSum);
        System.out.println ("偶数数总和为："+evenSum);
        int sum = oddSum + evenSum;
        System.out.println ("总数为："+sum);

    }
}
