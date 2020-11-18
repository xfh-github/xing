package com.xing.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {


        //System.out 输出的意思
        //System.in  输入的意思

        //创建一个扫面器对象，用于接受键盘的输入数据
        Scanner scanner = new Scanner (System.in);
        //通过System.in，创建了一个对象，并把它封装成了scanner对象
        //用scanner扫面用户的输入的测试
        System.out.println ("使用next方式接受：");

        //判断用户有没有输入字符串 有没有下一个 什么都不写代表的是:scanner.hasNext ()==true,代表有值
        if (scanner.hasNext ()) {
            //使用next方式接受用户的输入
            String str=scanner.next ();
            System.out.println ("输入的内容为："+str);

        }
        scanner.close ();

    }
}
