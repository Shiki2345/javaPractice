package AnimalShop;

public abstract class Rabbit extends Animal{

    public Rabbit(String name, int age, double price, char sex) {
        super(name, age, price, sex);
    }

    @Override
    public String toString() {
        return "兔兔名字：" + name + "兔兔年龄：" + age + "兔兔价格：" + price + "兔兔性别：" + sex;
    }
}
