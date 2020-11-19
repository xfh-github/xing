package com.xing.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        //if的双选择结构
        //考试成绩60分以上及格，考试分低于60不及格
        Scanner scanner = new Scanner (System.in);
        System.out.println ("请输入成绩：");

        int score = scanner.nextInt ();
        if(score>=60){
            System.out.println ("及格");
        }else {
            System.out.println ("不及格");
        }


        scanner.close ();
    }
}
