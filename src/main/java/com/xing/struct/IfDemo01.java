package com.xing.struct;

import java.util.Scanner;

public class IfDemo01 {
    //if 单选择选择结构
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("请输入内容：");

        String str = scanner.nextLine ();   //if 选择结构

        if(str.equals ("hello")){
            System.out.println ("你好");
        }else {
            System.out.println ("end");
        }



        scanner.close ();

    }
}
