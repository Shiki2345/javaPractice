package com.mypackage.base;

public class Books {
    // 定义书籍的标题和作者属性
    String title;
    String author;

    public static void main(String[] args) {

        // 创建一个 Books 类型的数组，最多可以存放 3 本书
        Books[] myBooks = new Books[3];

        // 为数组的每个元素实例化一个 Books 对象
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        // 给每本书设置标题和作者
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        // 使用 while 循环输出书籍信息
        int x = 0;
        while (x < 3) {
            System.out.print(myBooks[x].title); // 输出书名
            System.out.print(" by "); // 输出 "by" 字样
            System.out.println(myBooks[x].author); // 输出作者名
            x++; // 增加 x，继续输出下本书
        }
    }
}
