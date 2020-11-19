package com.xing.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求总和和平均数，每输入一个数字用回车来确认，如果输入的是非数字，终止输入，然后输出结果
        Scanner scanner = new Scanner (System.in);
        System.out.println ("请输入数字：");

        //和
        double sum=0;
        //计算输入了多少数字
        int m=0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        while(scanner.hasNextDouble ()){
            double x = scanner.nextDouble ();
            m=m+1;  //相等于m++
            sum=sum+x;
            System.out.println ("你输入了第"+m+"数据，当前所有数字的总和为："+sum);


        }

        System.out.println (m+"个数字的总和为："+sum);
        System.out.println (m+"个数字的平均数为："+(sum/m));

        scanner.close ();
    }
}
