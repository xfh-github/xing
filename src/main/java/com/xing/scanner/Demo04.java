package com.xing.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        int i=0;
        float f=0.0f;

        Scanner scanner = new Scanner (System.in);
        System.out.println ("请输入整数:");

        if(scanner.hasNextInt ()){
            i = scanner.nextInt ();
            System.out.println ("输出的整数："+i);
        }else {
            System.out.println ("输入的值不是整数！");
        }

        System.out.println ("===================");
        System.out.println ("请输入小数：");
        if(scanner.hasNextFloat ()){
            f = scanner.nextFloat ();
            System.out.println ("输出的小数："+f);
        }else {
            System.out.println ("输入的值不是小数！");
        }




        scanner.close ();
    }
}
