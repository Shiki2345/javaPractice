package com.mypackage.base;

public class 变量作用域 {
    static int allClicks = 0;//类变量
    String str="HelloWorld";//实例变量

    public void method() {
        int i = 0;//局部变量
    }
    //属性：变量

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值 0 0.0
    //布尔值：默认是false
    //除了基本类型，其余的默认值都是null；
    String name;
    int age;

    //main方法：
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new 变量作用域();

    }

    /*变量的命名规范：
     * 所有变量、方法、类名：见名知意
     * 类成员变量：首字母小写和驼峰原则(除了第一个单词后面首字母大写)：monthSalary/lastName
     * 局部变量：首字母小写和驼峰原则
     * 常量：大写字母和下划线：MAX_VALUE
     * 类名：首字母大写和驼峰原则：Man,GoodMan
     *方法名：首字母小写和驼峰原则：run();runRun()
     * */
}
