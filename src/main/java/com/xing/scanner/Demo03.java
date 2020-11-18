package com.xing.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        System.out.println ("请输入数据：");
        Scanner scanner = new Scanner (System.in);


        String str = scanner.nextLine ();

        System.out.println ("输出的数据为："+str);
        scanner.close ();

    }
}
