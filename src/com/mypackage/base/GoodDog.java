package com.mypackage.base;

public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }
    //get方法

    public void setSize(int S){
        size = S;
    }
    //set方法

    void bark(){
        if(size > 60)
        {
            System.out.println("大狗大狗叫叫叫！！！");
        }
        else if(size > 14)
        {
            System.out.println("中狗中狗叫叫叫！！！");
        }
        else
        {
            System.out.println("小狗小狗叫叫叫！！！");
        }
    }
}
class GoodDogTest{
    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two：" + two.getSize());

        one.bark();
        two.bark();
    }
}