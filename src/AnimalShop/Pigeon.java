package AnimalShop;

public abstract class Pigeon extends Animal{
    public Pigeon(String name,int age,double price,char sex){
        super(name, age, price, sex);
    }

    @Override
    public String toString() {
        return "鸽子名字" + name + "鸽子年龄" + age + "鸽子价格" + price+"鸽子性别" + sex ;
    }
}
