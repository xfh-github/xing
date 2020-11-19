package com.xing.struct;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //Switch(expression) case value:
        Scanner scanner = new Scanner (System.in);
        System.out.print("请输入一个字符串:");
        String grade = scanner.next ();

        switch (grade){
            case "Azxzzcz":
                System.out.println ("优秀");
                break;
            case "B":
                System.out.println ("良好");
                break;
            case "C":
                System.out.println ("中等");
                break;
            case "D":
                System.out.println ("不及格");
                break;
            default:
                System.out.println ("未知等级");
                break;
        }




        scanner.close ();

    }
}
