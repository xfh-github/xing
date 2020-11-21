package com.xing.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //数组 for-Each循环
        int[] arrays = {2, 3, 5, 7, 12, 342, 3};

        //jdk1.5之后，for-each没有了下标
//        for (int array : arrays) {
//            System.out.println (array);
//        }
        // printf (arrays);
       // reversal1 (arrays);
        //System.out.println ("=========");

        int[] a=reversal2 (arrays);
      // printf (a);
       // System.out.println (a.length);
        for (int i : a) {
            System.out.println (i);

        }
    }

    //1.打印数组元素
//    public static void printf(int[] arrays) {
//        for (int i = 0; i < arrays.length; i++) {
//            System.out.println (arrays[i]);
//        }
//    }

    //修饰符 返回值类型 方法名（参数类型 参数名）{
    //方法体
    // }


//    //2.反转数组    1.把第一个变成最后一个，依次反转 2.或者说遍历所有之后，放到一个数组里面，倒着输出
//    public static void reversal1(int[] arrays) {
//        for (int i = arrays.length; i > 0; i--) {
//            System.out.println (arrays[i - 1]);
//        }
//    }

    //3.反转数组 第二种解法  用数组接收
    public static int[] reversal2(int[] arrays) {
        int[] result = new int[arrays.length];
        for (int i = 0, j = result.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }
}




