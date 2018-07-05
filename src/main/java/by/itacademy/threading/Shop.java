package by.itacademy.threading;

import by.itacademy.threading.buyer.Buyer;
import by.itacademy.threading.cashbox.Cashbox;
import by.itacademy.threading.product.Bread;
import by.itacademy.threading.product.Vine;

/**
 * Created by user on 05.07.2018.
 */
public class Shop {
    public static void main(String[] args) {
        ShopConstructor shopConstructor = new ShopConstructor();
        shopConstructor.addCashboxs(new Cashbox("1"));
        shopConstructor.addCashboxs(new Cashbox("2"));
        Buyer buyer1 = new Buyer("Petya");
        buyer1.buy(new Vine(), 2);
        buyer1.buy(new Bread(), 1);
        Buyer buyer2 = new Buyer("Vitya1");
        buyer2.buy(new Vine(), 10);
        Buyer buyer3 = new Buyer("Petya123");
        buyer3.buy(new Vine(), 5);
        Queue queue = new Queue(buyer1);
        queue.addBuyrs(buyer1);
        queue.addBuyrs(buyer2);
        queue.addBuyrs(buyer3);
        new Thread(queue).start();

    }
}
