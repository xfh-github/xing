package com.xing.base;

public class Demo08 {
    //属性：变量
    //类变量 static 加了static为类变量 类变量会随着类一起出来，然后一起消失
    static double salary=25_0000;

    //实例变量：从属于对象，不用像局部变量一样赋初始值,但是如果不赋值，会初始化为默认值
    //处理基本类型,其他的默认值都为null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
    //局部变量：在main大括号开始而开始，在大括号合闭而结束。
    //局部变量：必须声明变量和初始赋值。这个变量i只在这个括号内使用！
        int a =1;
        System.out.println (a);
        System.out.println ("===========");

        //数据类型 变量名字=new Demo08 ();
        Demo08 demo08 = new Demo08 ();
        System.out.println (demo08.age);
        System.out.println (demo08.name);

        System.out.println ("===========");
        System.out.println (salary);


    }

    //其他方法
    public void add(){

    }

}
