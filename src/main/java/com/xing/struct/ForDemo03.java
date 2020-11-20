package com.xing.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：用while或者for循环输出从1到1000之间被5整除的数，并且每行输出个3个

        //5   10  15
        //20  25  30

        for (int i = 1; i <= 1000; i++) {
            if(i%5==0){
                System.out.print (i+"\t");
            }
            if (i%(5*3)==0){
                System.out.println ();
            }



        }


        }

    }

