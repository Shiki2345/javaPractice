package oop.Demo02;

public class Application {
    public static void main(String[] args) {
        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象！
        //student对象就是一个Student类的具体实例！

        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
         xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xh.name = "小红";
        xh.age = 3;

        System.out.println(xh.name);
        System.out.println(xh.age);


    }
}
