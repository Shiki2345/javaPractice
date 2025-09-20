package Dog;

class Dog {
    int size;
    String name;

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

class DogTest{
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog thr = new Dog();
        thr.size = 35;

        one.bark();
        thr.bark();
        two.bark();
    }

}