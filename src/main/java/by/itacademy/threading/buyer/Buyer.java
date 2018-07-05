package by.itacademy.threading.buyer;

import by.itacademy.threading.product.Product;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

/**
 * Created by user on 05.07.2018.
 */
public class Buyer<T> implements Buy, Runnable {
    private String name;
    private Map<T, Integer> productBasket;

    public Buyer(String name) {
        this.name = name;
        this.productBasket = new HashMap<T, Integer>();
    }

    public void buy(Product product, int quantity) {
        productBasket.put((T) product, quantity);
    }

    public Map<T, Integer> getProductBasket() {
        return productBasket;
    }

    public void run() {
        try {
            sleep(name.length()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Бегу на кассу" + name);
    }
}
