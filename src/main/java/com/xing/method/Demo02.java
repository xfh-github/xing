package com.xing.method;

public class Demo02 {
    public static void main(String[] args) {

        int max = max (2,2);
        System.out.println (max);
    }

    //方法名字：比大小 形式参数 sum1 sum2
    public static int max(int sum1 ,int sum2){
        if (sum1==sum2){
            System.out.println ("两数值相等");
            return 0; //return即表示返回，又表示终止方法
        }
        if(sum1>sum2){
            return sum1;
        }else {
            return sum2;
        }

    }
}
