package com.xing;

public class Demo06 {
    public Demo06(String name) {
    }

    public static void main(String[] args) {
        //操作比较大的数的情况下，注意内存溢出问题
        //jdk7,之后，比较大的数字之间可以用下划线分割，不影响大小
        int i=10_0000_0000;
        System.out.println (i);
        Demo06 demo06 = new Demo06 ("邢福豪");

    }
}
