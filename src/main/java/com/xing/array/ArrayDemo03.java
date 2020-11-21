package com.xing.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] a={2,3,11,5,7};

        //打印所有的数组元素
        for (int i = 0; i < a.length; i++) {
            System.out.println (a[i]);
        }
        System.out.println ("==========");

        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println (sum);
        System.out.println ("==========");

        //查找最大元素 比较大小，谁大给我，不大不换
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(max<=a[i]){
                max=a[i];
            }else {
               max= max;
            }
        }
        System.out.println (max);


    }
}
