package by.itacademy.threading.product;

/**
 * Created by user on 05.07.2018.
 */
public abstract class Product {
    private String nameProduct;
    private int price;

    public Product(String nameProduct, int price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }
}
