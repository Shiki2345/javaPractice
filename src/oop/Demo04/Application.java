package oop.Demo04;
import oop.Demo04.Student;

/*
* 1.提高程序的安全性，保护数据
* 2.隐藏代码的实现细节
* 3.统一接口
* 4.系统可维护增加了
* */

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("秦疆");
        System.out.println(s1.getName());

        int a = s1.setAge(999);
        System.out.println(s1.setAge(a));


    }
}




