package com.xing.method;

public class Demo03 {
    public static void main(String[] args) {
        Demo03 arrays = new Demo03 ();
        arrays.test (1,2,3,5);
    }

    public void test(int... a){
        System.out.println (a[0]);
    }


}
