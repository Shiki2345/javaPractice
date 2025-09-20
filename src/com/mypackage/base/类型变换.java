package com.mypackage.base;

public class 类型变换 {
    /*低----------------------------------高
     byte,short,char,int,long,float,double
     */
    //不能对布尔值进行转换；
    //不能把对象类型转化为不相干的类型；
    //高容量——低容量：强制转换；
    //转换时可能出现内存溢出/精度问题。
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;//内存溢出(byte范围：-128~127);(byte)为强制转换
        System.out.println(i);
        System.out.println(b);
    }
}
