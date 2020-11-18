package com.xing.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        System.out.print ("输入的字符串为：");
        //从键盘接收数据
        Scanner scanner = new Scanner (System.in);

        //判断是否还有输入
        if(scanner.hasNextLine ()){

            //等待用户输入
            String str = scanner.nextLine ();
            System.out.println ("输出的字符串为："+str);

        }
        scanner.close ();


    }
}
