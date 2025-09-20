package AnimalShop;

public abstract class Animal {

    protected String name;//private完全私有，protected是受保护的，继承才能用
    protected int age;
    protected char sex;
    protected double price;

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Animal(String name, int age, double price, char sex) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.sex = sex;
    }
    public abstract String toString();
}
