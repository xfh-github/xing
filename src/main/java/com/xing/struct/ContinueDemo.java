package com.xing.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        //continue用来跳过一些东西

        int i=0;
        while (i<100){
            i++;

            if (i%20==0){
                System.out.println ("跳出循环=======");
                System.out.println ();
                continue;
            }
            System.out.print (i+"\t");
        }

    }
}
