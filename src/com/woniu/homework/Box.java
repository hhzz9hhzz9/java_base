package com.woniu.homework;

class A {
    private static int numA;//��̬����
    private int numA2;//��Ա����
    //��̬�����
    static {
        System.out.println("A�ľ�̬�ֶ� : " + numA);
        System.out.println("A�ľ�̬�����");
    }
    //�����
    {
        System.out.println("A�ĳ�Ա����  : " + numA2);
        System.out.println("A�ķǾ�̬�����");
    }
    //�޲ι�����
    public A() {
        System.out.println("A�Ĺ�����");
    }
}
class B extends A {
    private static int numB;//��̬����
    private int numB2;//��Ա����
    //��̬�����
    static {
        System.out.println("B�ľ�̬�ֶ� : " + numB);
        System.out.println("B�ľ�̬�����");
    }
    //�����
    {
        System.out.println("B�ĳ�Ա���� : " + numB2);
        System.out.println("B�ķǾ�̬�����");
    }
    //�޲ι�����
    public B() {
        System.out.println("B�Ĺ�����");
    }
}
 
public class Box {
    public static void main(String[] args) {
    	//������һ������,
    	//�ȼ���ʱ��̬  ���ȸ���ģ��������   
    	//��ηǾ�̬   ���ȸ���ģ��������
    
       A ab = new B();
//        System.out.println("---");
//        ab = new B();
    }
}
