package java_oop.HW_1;

public interface VendingMachine {
    Product getProductByName(String name);

    Product getProductByCost(Integer cost);

    void addProduct(Product product);

}
