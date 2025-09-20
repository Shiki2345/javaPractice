package com.mypackage.base;

// 定义一个名为 Dog 的类
public class Dog {
    // 定义一个狗的名字变量，用来存储每只狗的名字
    String name;

    // main 方法是程序的入口点
    public static void main(String[] args) {
        // 创建第一只狗对象 Dog1
        Dog Dog1 = new Dog();
        Dog1.bark(); // 调用 Dog1 的 bark 方法，打印出狗叫
        Dog1.name = "doudou"; // 设置 Dog1 的名字为 "doudou"

        // 创建第二只狗对象 Dog114
        Dog Dog114 = new Dog();
        Dog114.name = "tanaka"; // 设置 Dog114 的名字为 "tanaka"
        Dog114.bark(); // 调用 Dog114 的 bark 方法，打印出狗叫

        // 创建一个 Dog 类型的数组，最多存放 3 只狗
        Dog[] myDogs = new Dog[3];

        // 将三只狗分别放入数组中
        myDogs[0] = new Dog(); // 创建一只新的狗并放入数组的第一个位置
        myDogs[1] = new Dog(); // 创建另一只新的狗并放入数组的第二个位置
        myDogs[2] = Dog1; // 将之前创建的 Dog1 放入数组的第三个位置

        // 给数组中的狗们分别命名
        myDogs[0].name = "qiuqiu"; // 给数组中的第一只狗命名为 "qiuqiu"
        myDogs[1].name = "paopao"; // 给数组中的第二只狗命名为 "paopao"

        // 打印出数组中第三只狗的名字
        System.out.print("最后一只狗的名字是：");
        System.out.println(myDogs[2].name); // 打印 "doudou"（Dog1 的名字）

        // 使用 for 循环遍历数组，逐个打印狗的名字
        for (int i = 0; i < myDogs.length; i++) {
            System.out.println(myDogs[i].name); // 输出每只狗的名字
        }

        // 逐个让每只狗叫
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark(); // 调用数组中每只狗的 bark 方法
            x++; // x 增加，继续下一个狗
        }
    }

    // bark 方法是狗的叫声行为，打印出狗的名字并输出 "大狗大狗叫叫叫"
    public void bark() {
        System.out.println(name + " 大狗大狗叫叫叫");
    }

    // bite 方法是狗的攻击行为，打印出狗的名字并输出 "哈基汪大旋风"
    public void bite() {
        System.out.println(name + " 哈基汪大旋风");
    }
}
