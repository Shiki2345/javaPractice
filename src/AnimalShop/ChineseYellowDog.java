package AnimalShop;

public abstract class ChineseYellowDog extends Animal{
          boolean isVaccinelnjected;


    public ChineseYellowDog(String name, int age, double price, char sex) {
        super(name, age, price, sex);
    }

    @Override
    public String toString() {
        return "狗狗名字：" + name + "狗狗年龄：" + age  + "价格：" + price + "狗狗性别："+sex;
    }
}
