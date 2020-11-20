package com.xing.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        //for循环增强
        double[] array =new double[3];
        array[0]=17.4;
        array[1]=7.4;
        array[2]=4.1;

        double[] array1 ={1,3,4};

        for (double element : array) {
            System.out.print(element+"\t");
        }
        System.out.println ();

        System.out.println ("=============");

        for (double element : array1) {
            System.out.print(element+"\t");
        }

        System.out.println ();

        System.out.println ("=============");

        for (int i = 0; i <array.length ; i++) {
            System.out.println (array[i]);
        }


    }
}
