package oop.Demo05;
//在JAVA中，所有的类都默认直接或间接继承object。
//Person 人 （父类）
public class Person {
    public int money = 10_0000_0000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("说了一句话");

    }
}
