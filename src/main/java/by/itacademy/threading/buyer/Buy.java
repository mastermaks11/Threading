package by.itacademy.threading.buyer;

import by.itacademy.threading.product.Product;

/**
 * Created by user on 05.07.2018.
 */
public interface Buy <T extends Product> {
    void buy(T product, int quantity);
}
