package com.xing.operator;

//导入com.xing.operator这个包下的所有的类
import com.xing.operator.*;
public class Demo07 {
    public static void main(String[] args) {
        //三元运算符 三个元素之间的运算
        // x?y:z
        //如果x==true 结果为y 否则为z
        int a = 2;
        int b = 3;

        int score = a > 1 ? 9 : 6;
        System.out.println (score);

        System.out.println ("=========");

        int score2 = a > 3 ? 9 : b;
        System.out.println (score2);


    }
}
