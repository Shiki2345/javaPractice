package AnimalShop;

public interface AnimalShopInterface {

    public void BuyNewAnimals();
    public void TreatCustomers();
    public void OpenShop();
    public void CloseShop();

    //宠物店购买一定数量的宠物
    void BuyNewAnimals(Animal a, int num);

    //宠物店购买一定数量的宠物
    void BuyNewAnimals(Animal animal);
}
