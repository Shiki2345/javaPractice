//package AnimalShop;
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//
//import java.time.LocalDate;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ArrayList; // 引入 ArrayList 类
//
//public class MyAnimalShop implements AnimalShopInterface{
//        private double Balance;//店的余额double
//        private double profit = 0;//每日刚开张的余额
//        ArrayList<Animal> AnimalShopList = new ArrayList<>();//一个存放动物的列表
//        ArrayList<Customer> CustomerList = new ArrayList<>();//一个顾客列表
//        private boolean isClosed;
//
//
//
//    public MyAnimalShop(double Balance, boolean isClosed) {
//        this.Balance = Balance;
//        this.isClosed = isClosed;
//    }//店的余额
//
//    public double getBalance() {
//        return Balance;
//    }
//
//    public void setBalance(double balance) {
//        this.Balance = balance;
//    }
//
//    public ArrayList<Animal> getAnimalShopList() {
//        return AnimalShopList;
//    }
//
//    public void setAnimalShopList(ArrayList<Animal> animalShopList) {
//        AnimalShopList = animalShopList;
//    }
//
//    public ArrayList<Customer> getCustomerList() {
//        return CustomerList;
//    }
//
//    public void setCustomerList(ArrayList<Customer> customerList) {
//        CustomerList = customerList;
//    }
//
//    public double getProfit() {
//        return profit;
//    }
//
//    public void setProfit(double profit) {
//        this.profit = profit;
//    }
//
//    public boolean isClosed() {
//        return isClosed;
//    }
//
//    public void setClosed(boolean closed) {
//        isClosed = closed;
//    }
//
//    //宠物店购买一定数量的宠物
//    @Override
//    public void BuyNewAnimals(Animal animal) {
//        try {
//            if (Balance >= animal.price) {
//                Balance -= animal.price;
//                AnimalShopList.add(animal);
//                System.out.println("购买成功！");
//            } else {
//                throw new InsufficientBalanceException("余额不足！");
//            }
//
//    //@Override
//    //public void TreatCustomers(Customer ); {
//
//
//        //try{
//            //if(isClosed)
//            {
//                //System.out.println("下班啦");
//            }
//
//
//        //}
//   // }
//
//    @Override
//    public void OpenShop() {
//
//    }
//
//    @Override
//    public void CloseShop() {
//
//    }
//
//    @Override
//    public void BuyNewAnimals(Animal a, int num) {
//
//    }