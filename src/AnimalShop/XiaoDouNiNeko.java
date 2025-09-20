package AnimalShop;

public abstract class XiaoDouNiNeko extends Animal{

    public XiaoDouNiNeko(String name, int age, double price, char sex) {
        super(name, age, price, sex);
    }

    @Override
    public String toString() {
        return "猫猫名字：" + name + "猫猫年龄：" + age + "猫猫价格：" + price + "猫猫性别：" + sex;

    }
}
