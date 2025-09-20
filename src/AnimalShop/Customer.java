package AnimalShop;

public class Customer {
    protected String name;
    protected int number;
    protected double LocalDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(double localDate) {
        LocalDate = localDate;
    }
    @Override
    public String toString() {
        return "顾客姓名：" + name + "到店次数：" + number + "最新到店时间：" + LocalDate;
    }
}
