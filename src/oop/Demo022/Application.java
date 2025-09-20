package oop.Demo022;
//一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("kuangshen");
        System.out.println(person.name);
    }
}
