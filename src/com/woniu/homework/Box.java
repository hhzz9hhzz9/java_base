package com.woniu.homework;

class A {
    private static int numA;//静态属性
    private int numA2;//成员属性
    //静态代码块
    static {
        System.out.println("A的静态字段 : " + numA);
        System.out.println("A的静态代码块");
    }
    //代码块
    {
        System.out.println("A的成员变量  : " + numA2);
        System.out.println("A的非静态代码块");
    }
    //无参构造器
    public A() {
        System.out.println("A的构造器");
    }
}
class B extends A {
    private static int numB;//静态属性
    private int numB2;//成员属性
    //静态代码块
    static {
        System.out.println("B的静态字段 : " + numB);
        System.out.println("B的静态代码块");
    }
    //代码块
    {
        System.out.println("B的成员变量 : " + numB2);
        System.out.println("B的非静态代码块");
    }
    //无参构造器
    public B() {
        System.out.println("B的构造器");
    }
}
 
public class Box {
    public static void main(String[] args) {
    	//创建了一个对象,
    	//先加载时静态  ：先父类的，再子类的   
    	//其次非静态   ：先父类的，再子类的
    
       A ab = new B();
//        System.out.println("---");
//        ab = new B();
    }
}
